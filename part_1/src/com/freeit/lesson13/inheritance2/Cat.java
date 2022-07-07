package com.freeit.lesson13.inheritance2;

import com.sun.security.jgss.GSSUtil;

public class Cat extends Pet {

    String name;

    public Cat(String reenvironment, String breed, String name) {
        super(reenvironment, breed);
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Meowwwww");
    }

    public void piss() {
        System.out.println("Pissing in boots....");
    }
}
