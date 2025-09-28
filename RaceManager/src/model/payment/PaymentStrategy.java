package model.payment;

import model.User;

public interface PaymentStrategy {
    boolean pay(double amount, String payerName, String reference, String details);
}
