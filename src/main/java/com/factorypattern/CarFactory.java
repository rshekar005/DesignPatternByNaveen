package com.factorypattern;

/**
 * {@code CarFactory} is a factory class that creates instances of different types of cars.
 * It follows the Factory Pattern to decouple the client code from the concrete car classes.
 *
 * The Factory Design Pattern is one of the most common creational patterns in Java.
 * It provides an interface for creating objects but lets subclasses decide which class to instantiate.
 * It's used to encapsulate object creation logic, promoting loose coupling.
 */
public class CarFactory {
    /**
     * Returns an instance of a Car based on the provided car type.
     *
     * @param carType A String representing the type of car to create (e.g., "Truck", "Sedan", "SUV").
     *                Case-insensitive.
     * @return An instance of the specified Car type, or null if the car type is unknown or null.
     */
    public static Car getCar(String carType) {
        if (carType == null) {
            return null;
        }
        if (carType.equalsIgnoreCase("Truck")) {
            return new Truck();
        } else if (carType.equalsIgnoreCase("Sedan")) {
            return new Sedan();
        } else if (carType.equalsIgnoreCase("SUV")) {
            return new SUV();
        }
        return null;
    }
}