package com.freeit.lesson13.inheritance;

import java.util.UUID;

public class Truck extends Car {

    private final String VIN;

    public Truck(int year, String brand, String model) {
        super(year, brand, model);
        this.VIN = UUID.randomUUID().toString();
    }

    @Override
    public void signal() {
        System.err.println("BEEEeEeEeEp BBEEEEEeEEEeeEEPPP");
    }

    @Override
    public String toString() {
        return "This is my track: \n" + "VIN: " + this.VIN + "\n" + super.toString();
    }
}

