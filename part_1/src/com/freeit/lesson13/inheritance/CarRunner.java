package com.freeit.lesson13.inheritance;

public class CarRunner {
    public static void main(String[] args) {

        Truck truck = new Truck(20222, "Bushmister", "BM52");

        truck.signal();

        System.out.println(truck);

    }
}
