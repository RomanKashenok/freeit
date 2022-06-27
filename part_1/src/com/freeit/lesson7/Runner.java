package com.freeit.lesson7;

import com.freeit.lesson7.garage.Garage;

public class Runner {
    public static void main(String[] args) {

        Garage g = new Garage();
        System.out.println(g);

        Garage g2 = new Garage(6, 10, "Euroservice ***");
        System.out.println(g2);

        Garage g3 = new Garage("Renault drive");
        System.out.println(g3);
    }
}
