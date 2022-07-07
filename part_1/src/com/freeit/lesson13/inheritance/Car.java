package com.freeit.lesson13.inheritance;

public class Car extends Object {
    protected int year;
    protected String brand;
    protected String model;

    protected Car(int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.model = model;
    }

    public void signal() {
        System.out.println("WoooohWooooh!!!!");
    }

    protected String getIdentifier() {
        return "heavy " + model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
