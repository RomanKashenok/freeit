package com.freeit.lesson9;

public class Phone {

    private final String brand;
    private final String model;
    private Headphones headphones;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public boolean connectHeadphones(Headphones headphones) {
        if(headphones.isBluetooth()) {
            System.out.println("Connected");
            this.headphones = headphones;
            return true;
        }
        if(headphones.isWiredBased()) {
            System.out.println("Plugged in");
            this.headphones = headphones;
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", headphones=" + headphones +
                '}';
    }
}
