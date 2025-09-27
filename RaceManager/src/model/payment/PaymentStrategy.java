package model.payment;

import model.User;

public interface PaymentStrategy {
    boolean pay(double amount, User payer, String reference, String details);
}
