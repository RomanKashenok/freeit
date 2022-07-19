package com.freeit.lesson15.intVsabstr;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Random;

public class Boeing extends Airplane {

    protected Boeing(String model, double maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void extendFlaps() {
        System.out.println("Flaps extended...");
    }

    @Override
    public void flyUp() {
        System.out.println("Woooooooooooohoooooooo");
    }

    @Override
    public void land() {
        System.out.println("God save us please!");
    }

    @Override
    public int getCurrentHigh() {
        return new Random().nextInt(500) + 1000;
    }

    @Override
    public double getCurrentSpeed() {
        return new Random().nextInt(300) + 500;
    }

    @Override
    public Map.Entry<Double, Double> getGpsCoords() {
        return new AbstractMap.SimpleEntry<>(new Random().nextDouble() * 1000, new Random().nextDouble() * 1000);
    }
}
