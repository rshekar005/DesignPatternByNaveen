package com.factorypattern;

/**
     * {@code TestCar} class is a client to test the car factory.
     * It creates different types of cars using the {@code CarFactory} and calls their assemble methods.
     */
    public class TestCar {
        /**
         * Main method to demonstrate the car creation using the factory pattern.
         *
         * @param args Command line arguments (not used).
         */
        public static void main(String[] args) {
            // Get a Truck instance using the CarFactory and assemble it.
            Car car1 = CarFactory.getCar("Truck");
            car1.assemble();
            // Get a Sedan instance using the CarFactory and assemble it.
            Car car2 = CarFactory.getCar("Sedan");
            car2.assemble();
            // Get an SUV instance using the CarFactory and assemble it.
            Car car3 = CarFactory.getCar("SUV");
            car3.assemble();
        }
    }