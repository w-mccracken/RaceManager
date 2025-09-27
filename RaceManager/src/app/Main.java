package app;

import controller.RaceController;
import controller.ResultController;
import model.Race;
import model.RaceResult;
import model.Racer;
import model.notification.RacerSubscriber;
import view.PaymentView;
import view.ResultView;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Controllers
        RaceController raceController = new RaceController();
        ResultController resultController = new ResultController();
//Test Github working
        // Views
        PaymentView paymentView = new PaymentView(raceController);
        ResultView resultView = new ResultView(resultController);

        // Domain: a racer and a race
        Racer alice = new Racer();
        alice.setName("Alice Rider");

        Race race = new Race("123"); // simple ctor with raceID

        // Subscribe racer to both global "race" updates and results postings
        RacerSubscriber aliceSub = new RacerSubscriber(alice);
        raceController.getRaceNotifications().attach(aliceSub);
        resultController.getRaceNotifications().attach(aliceSub);

        int raceId = 123;
        int userId = 1;

        // === Payment selection in View, routed via Controller to Model ===
        String method = paymentView.selectMethod(); // "credit" (stub)
        String details;
        switch (method.toLowerCase()) {
            case "credit" -> details = paymentView.enterCardNumber();
            case "paypal" -> details = paymentView.enterPayPalEmail();
            case "stripe" -> details = paymentView.enterStripeToken();
            default -> throw new IllegalArgumentException("Unknown method: " + method);
        }

        // Process payment (controller -> model.strategy) and emit notifications
        raceController.handleSelectPaymentAndPay(method, details, raceId, userId);

        // Confirm sign-up (emits a race-scoped notification)
        raceController.handleRaceSignUp(raceId, userId);

        // === Simulate the race happening & results posting ===
        RaceResult result = new RaceResult(race);
        Map<String, String> times = new HashMap<>();
        times.put(alice.getName(), "00:45:12");
        result.setTimes(times);
        result.setPodium(new Racer[]{ alice, new Racer(), new Racer() });

        // Post results (controller -> notifications)
        resultController.handleEnterResults(result);

        // Racer checks results in the View
        resultView.displayResults(result);
    }
}
