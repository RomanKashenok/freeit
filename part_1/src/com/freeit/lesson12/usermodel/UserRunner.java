package com.freeit.lesson12.usermodel;

import java.util.Random;

public class UserRunner {
    public static void main(String[] args) {
        User vasya = new User();
        vasya.setName("Vasya");

        User kolya = new User();
        kolya.setName("Kolya");
        Random rand = new Random();

        for (int i = 0; i < rand.nextInt(40) + 20; i++) {
            vasya.getName();
        }

        for (int i = 0; i < rand.nextInt(40) + 20; i++) {
            kolya.getName();
        }

        System.out.println("Vasya: " + User.getCounter());
        System.out.println("Kolya: " + User.getCounter());

    }
}
