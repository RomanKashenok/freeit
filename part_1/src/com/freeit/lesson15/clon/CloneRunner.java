package com.freeit.lesson15.clon;

public class CloneRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = new Car(2012, "Mazda", "mx-3");
        User user1 = new User("Tolik", car1);

//        User clone = (User) user1.clone();
        User clone = new User(user1);
        clone.setName("Bolik");

        System.out.println(user1);
        System.out.println(clone);

        clone.getCar().setBrand("Volvo");
        clone.getCar().setModel("XC-90");
        clone.getCar().setYear(2022);

//        clone.setCar(new Car(2022, "Volvo", "XC-90"));

        System.out.println(user1);
        System.out.println(clone);
    }
}
