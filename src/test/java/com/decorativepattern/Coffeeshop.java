package com.decorativepattern;

public class Coffeeshop {

    public static void main(String[] args) {
        Coffee coffee=new NormalCoffee();
        System.out.println(coffee.description()+" Cost $"+coffee.getCost());

        coffee=new MilkDecorator(coffee);
        System.out.println(coffee.description()+" Cost $"+coffee.getCost());

        coffee=new CreamDecorator(coffee);
        System.out.println(coffee.description()+" Cost $"+coffee.getCost());

        coffee=new SugarDecorator(coffee);
        System.out.println(coffee.description()+" Cost $"+coffee.getCost());
    }
}
