package com.freeit.lesson9;

public class Runner {
    public static void main(String[] args) {

        Phone p = new Phone("Samsung", "S20 plus 5G");
        Headphones hp = new Headphones("QCY", true);

        System.out.println(p);

        p.connectHeadphones(hp);

        System.out.println(p);

    }
}
