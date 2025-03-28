package com.strategypattern;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Making the payment of $" + amount + " using Credit Card");
    }
}
