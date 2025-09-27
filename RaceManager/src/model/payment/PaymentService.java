package model.payment;

import model.User;

public class PaymentService {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean process(double amount, User payer, String reference, String details) {
        if (strategy == null) {
            throw new IllegalStateException("PaymentStrategy not set");
        }
        return strategy.pay(amount, payer, reference, details);
    }
}

