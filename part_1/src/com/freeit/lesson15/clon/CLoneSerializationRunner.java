package com.freeit.lesson15.clon;

import java.io.*;

public class CLoneSerializationRunner {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Car car = new Car(2022, "Volvo", "XC-90");
        User user = new User("Tolik", car);
        Cat catOriginal = new Cat("Vaska", 5, user);

        FileOutputStream fos = new FileOutputStream("cat_clone.qwe");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(catOriginal);

        FileInputStream fis = new FileInputStream("cat_clone.qwe");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Cat clone = (Cat) ois.readObject();

        System.out.println(catOriginal);
        System.out.println(clone);
    }
}
