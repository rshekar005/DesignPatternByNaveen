package com.factorypattern;

public class Truck implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling Truck");
    }
}
