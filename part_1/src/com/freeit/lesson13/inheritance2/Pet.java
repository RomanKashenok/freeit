package com.freeit.lesson13.inheritance2;

public class Pet extends Animal {

    String breed;

    public Pet(String reenvironment, String breed) {
        super(reenvironment);
        this.breed = breed;
    }
}
