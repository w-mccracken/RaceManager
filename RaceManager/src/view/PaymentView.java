package view;

import controller.RaceController;

public class PaymentView {
    private final RaceController controller;

    public PaymentView(RaceController controller) { this.controller = controller; }

    public String selectMethod() { return "credit"; }       // stub: collect input
    public String enterCardNumber() { return "****1234"; }  // stub
    public String enterPayPalEmail() { return "user@example.com"; } // stub
    public String enterStripeToken() { return "tok_ABC"; }  // stub

    public void showPaymentResult(boolean ok, String message) {
        System.out.println(ok ? "[OK] " + message : "[FAIL] " + message);
    }
}

