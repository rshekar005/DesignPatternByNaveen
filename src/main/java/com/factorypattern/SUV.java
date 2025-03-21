package com.factorypattern;

public class SUV implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling SUV");
    }
}
