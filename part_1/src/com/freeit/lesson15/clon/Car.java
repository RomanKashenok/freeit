package com.freeit.lesson15.clon;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Cloneable, Serializable, Comparable<Car> {

    transient int year;
    transient String brand;
    transient String model;

    public Car(int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        int hash = 9;
        hash = 31 * hash + year;
        hash = 31 * hash + (brand == null ? 0 : brand.hashCode());
        hash = 31 * hash + (model == null ? 0 : model.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.year - o.year;
    }
}