package com.freeit.lesson14.interf;

public interface Remote {

    void turnOn();

    void turnOff();

    default void chooseDimension() {
        System.out.println("default choosing dimension");
    };

}
