package com.factorypattern;

/**
 * {@code Car} interface represents a generic car.
 * It defines the {@code assemble} method that all concrete car classes must implement.
 */
public interface Car {
    /**
     * Assembles the car.
     * This method should be implemented by concrete car classes to define the assembly process.
     */
    public void assemble();
}