package com.freeit.lesson7.garage;

public class Garage {

    public int openAm = 8;
    public int closePm = 8;
    public String name;

    public Garage() {
        name = "default";
    }

    public Garage(String garageName) {
        name = garageName;
    }

    public Garage(int open, int close, String garageName) {
        openAm = open;
        closePm = close;
        name = garageName;
    }

    public void changeOil() {
        System.out.println("Oil in car changed");
    }

    public void repairVehicle() {
        System.out.println("Your vehicle had been repaired!");
    }

    @Override
    public String toString() {
        return "Garage{" +
                "openAm=" + openAm +
                ", closePm=" + closePm +
                ", name='" + name + '\'' +
                '}';
    }
}
