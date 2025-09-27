package controller;

import model.Race;
import model.Racer;
import model.payment.*;
import model.notification.*;

public class RaceController {

    private final PaymentService paymentService = new PaymentService();
    private final NotificationCenter notificationCenter = new NotificationCenter();
    // For per-race events, you’d manage a map<RaceId, RaceNotifications>
    private final RaceNotifications raceNotifications = new RaceNotifications();

    public void handleBrowseRaces() { }

    public void handleRaceSignUp(int raceId, int userId) {
        // TODO: fetch Race, Racer; register; notify:
        raceNotifications.publishRaceEvent("SIGNUP_CONFIRMED", "Racer " + userId + " -> Race " + raceId);
    }

    public void handleSelectPaymentAndPay(String method, String details, int raceId, int userId) {
        // choose strategy
        switch (method.toLowerCase()) {
            case "credit" -> paymentService.setStrategy(new CreditCardPayment());
            case "paypal" -> paymentService.setStrategy(new PayPalPayment());
            case "stripe" -> paymentService.setStrategy(new StripePayment());
            default -> throw new IllegalArgumentException("Unknown payment method: " + method);
        }
        // minimal demo values
        boolean ok = paymentService.process(45.00, new Racer(), "Race#" + raceId, details);

        if (ok) {
            raceNotifications.publishRaceEvent("PAYMENT_SUCCESS", "User " + userId + " paid for Race " + raceId);
        } else {
            raceNotifications.publishRaceEvent("PAYMENT_FAILED", "User " + userId + " failed payment for Race " + raceId);
        }
    }

    // exposure for wiring subscribers (e.g., from View)
    public NotificationCenter getNotificationCenter() { return notificationCenter; }
    public RaceNotifications getRaceNotifications() { return raceNotifications; }
}

