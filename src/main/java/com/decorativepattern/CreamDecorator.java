package com.decorativepattern;

public class CreamDecorator extends CoffeeDecorator{
    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.0;
    }

    @Override
    public String description() {
        return super.description() + ", Cream";
    }
}
