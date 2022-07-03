package com.freeit.lesson9;

public class Headphones {

    private final String brand;
    private final boolean isBluetooth;

    public Headphones(String brand, boolean isBluetooth) {
        this.brand = brand;
        this.isBluetooth = isBluetooth;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isBluetooth() {
        return isBluetooth;
    }

    public boolean isWiredBased() {
        return !isBluetooth;
    }

    @Override
    public String toString() {
        return "Headphones{" +
                "brand='" + brand + '\'' +
                ", isBluetooth=" + isBluetooth +
                '}';
    }
}
