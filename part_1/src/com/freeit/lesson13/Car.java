package com.freeit.lesson13;

public class Car {
    int year;
    String brand;
    String model;
//    CarEngine engine;

    public Car(int year, String brand, String model/*, double engCapacity, String fuelType, int cil*/) {
        this.year = year;
        this.brand = brand;
        this.model = model;
//        this.engine = new CarEngine(engCapacity, fuelType, cil);
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
//                ", engine=" + engine +
                '}';
    }

//    class CarEngine {
//        double engineCapacity;
//        String fuelType;
//        int cyliders;
//
//        public CarEngine(double engineCapacity, String fuelType, int cyliders) {
//            this.engineCapacity = engineCapacity;
//            this.fuelType = fuelType;
//            this.cyliders = cyliders;
//        }
//    }
}