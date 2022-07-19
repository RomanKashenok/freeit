package com.freeit.lesson15.intVsabstr;

public abstract class BalloonFlyer implements AirFlyer {

    private final double balloonVolume;
    private final double maxWeight;
    private int maxPassengers;

    protected BalloonFlyer(double balloonVolume, double maxWeight) {
        this.balloonVolume = balloonVolume;
        this.maxWeight = maxWeight;
    }

    protected BalloonFlyer(double balloonVolume, double maxWeight, int maxPassengers) {
        this(balloonVolume, maxWeight);
        this.maxPassengers = maxPassengers;
    }

    public double getBalloonVolume() {
        return balloonVolume;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
}
