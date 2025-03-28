package com.strategypattern;

/**
 * {@code PaymentTest} class demonstrates the usage of different payment strategies
 * through the {@link PaymentContext}.
 */
public class PaymentTest {
    /**
     * Main method to test the payment strategies.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new CreditCardPayment());
        paymentContext.pay(100.10);
        paymentContext.setPaymentStrategy(new PaypalPayment());
        paymentContext.pay(200.20);
        paymentContext.setPaymentStrategy(new BankTransferPayment());
        paymentContext.pay(300.30);
    }
}