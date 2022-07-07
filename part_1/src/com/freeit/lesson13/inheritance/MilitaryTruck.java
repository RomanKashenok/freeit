package com.freeit.lesson13.inheritance;

public class MilitaryTruck extends Truck {

    private String area;

    public MilitaryTruck(int year, String brand, String model, String area) {
        super(year, brand, model);
        this.area = area;
    }

    @Override
    public String toString() {
        return "Military..." + super.toString();
    }
}
