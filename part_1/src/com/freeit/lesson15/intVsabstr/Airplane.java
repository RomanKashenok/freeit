package com.freeit.lesson15.intVsabstr;

public abstract class Airplane implements AirFlyer {

    private final String model;
    private final double maxSpeed;

    protected Airplane(String model, double maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public abstract void extendFlaps();
}
