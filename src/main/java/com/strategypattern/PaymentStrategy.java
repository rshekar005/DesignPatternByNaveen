package com.strategypattern;

/**
 * {@code PaymentStrategy} interface defines the contract for different payment strategies.
 * Implementations of this interface should provide a concrete way to process payments.
 */
public interface PaymentStrategy {
    /**
     * Processes a payment of the specified amount.
     *
     * @param amount The amount to be paid.
     */
    public void pay(double amount);
}