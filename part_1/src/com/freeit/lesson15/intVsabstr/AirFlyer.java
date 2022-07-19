package com.freeit.lesson15.intVsabstr;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Random;

public interface AirFlyer {

    double G = 9.81;

    static void someMethod() {
        System.out.println("some method");
    }

    void flyUp();

    void land();

    int getCurrentHigh();

    double getCurrentSpeed();

    default Map.Entry<Double, Double> getGpsCoords() {
        return new AbstractMap.SimpleEntry<>(new Random().nextDouble(), new Random().nextDouble());
    }

    default int getCurrentHigh(String loggerName) {
        System.out.println("current height requested with logger: " + loggerName);
        return this.getCurrentHigh();
    }
}
