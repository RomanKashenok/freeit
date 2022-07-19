package com.freeit.lesson15.intVsabstr;

import java.util.Random;

public class Balloon extends BalloonFlyer {

    private double antiWeight;

    protected Balloon(double balloonVolume, double maxWeight) {
        super(balloonVolume, maxWeight);
        this.antiWeight = new Random().nextInt(50) + 50;
    }

    protected Balloon(double balloonVolume, double maxWeight, int maxPassengers, double antiWeight) {
        super(balloonVolume, maxWeight, maxPassengers);
        this.antiWeight = antiWeight;
    }

    @Override
    public void flyUp() {
        System.out.println("Heating...");
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Something goes wrong....");
            }
            System.out.println("still heating... " + i);
        }
        System.out.println("Hoooray! We are in the air!");
    }

    @Override
    public void land() {
        System.out.println("Let's hit the ground :)");
    }

    @Override
    public int getCurrentHigh() {
        return new Random().nextInt(100) + 100;
    }

    @Override
    public double getCurrentSpeed() {
        return new Random().nextInt(50) + 50;
    }

    public double getAntiWeight() {
        return new Random().nextInt(50) + 50;
    }

    public void setAntiWeight(double antiWeight) {
        this.antiWeight = antiWeight;
    }

    @Override
    public void setMaxPassengers(int maxPassengers) {
        super.setMaxPassengers(maxPassengers);
    }
}
