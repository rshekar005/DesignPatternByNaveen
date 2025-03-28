package com.strategypattern;

public class PaypalPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Making the payment of $" + amount + " using Paypal");
    }
}
