package com.strategypattern;

/**
 * {@code PaymentContext} class manages the payment strategy to be used.
 * It allows setting and changing the payment strategy at runtime.
 */
public class PaymentContext {

    public PaymentStrategy paymentStrategy;

    /**
     * Constructs a {@code PaymentContext} with the specified payment strategy.
     *
     * @param paymentStrategy The initial payment strategy to be used.
     */
    public PaymentContext(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * Sets the payment strategy to be used.
     *
     * @param paymentStrategy The payment strategy to set.
     */
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * Executes the payment using the currently set payment strategy.
     *
     * @param amount The amount to be paid.
     */
    public void pay(double amount){
        paymentStrategy.pay(amount);
    }
}