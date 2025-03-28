package com.strategypattern;

public class BankTransferPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Making the payment of $" + amount + " using Bank Transfer");
    }
}
