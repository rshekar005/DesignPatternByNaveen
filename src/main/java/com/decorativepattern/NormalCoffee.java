package com.decorativepattern;

public class NormalCoffee implements Coffee{
    @Override
    public double getCost() {
        return 20.0;
    }

    @Override
    public String description() {
        return "Simple Coffee";
    }
}
