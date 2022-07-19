package com.freeit.lesson15.intVsabstr;

import java.util.Random;

public class Dirigible extends BalloonFlyer {

    private final double fuelTankCapacity;

    protected Dirigible(double balloonVolume, double maxWeight) {
        this(balloonVolume, maxWeight, new Random().nextInt(50) + 50);
    }

    public Dirigible(double balloonVolume, double maxWeight, int maxPassengers) {
        this(balloonVolume, maxWeight, maxPassengers, new Random().nextInt(50) + 50);
    }

    protected Dirigible(double balloonVolume, double maxWeight, int maxPassengers, double fuelTankCapacity) {
        super(balloonVolume, maxWeight, maxPassengers);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void flyUp() {
        System.out.println("Getting up in the air!!!");
    }

    @Override
    public void land() {
        System.out.println("Safe landing for us :)");
    }

    @Override
    public int getCurrentHigh() {
        return new Random().nextInt(100) + 100;
    }

    @Override
    public double getCurrentSpeed() {
        return new Random().nextInt(50) + 50;
    }

    public double getCurrentFuelAmount() {
        return new Random().nextInt(50) + 50;
    }

    @Override
    public void setMaxPassengers(int maxPassengers) {
        super.setMaxPassengers(maxPassengers);
    }
}
