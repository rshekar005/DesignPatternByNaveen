package com.decorativepattern;

/**
 * {@code Coffee} interface defines the base interface for all coffee types.
 * It declares methods to get the cost and description of the coffee.
 */
public interface Coffee {
    /**
     * Returns the cost of the coffee.
     *
     * @return The cost of the coffee.
     */
    double getCost();

    /**
     * Returns the description of the coffee.
     *
     * @return The description of the coffee.
     */
    String description();
}