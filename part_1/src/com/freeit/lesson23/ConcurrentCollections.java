package com.freeit.lesson23;

import com.freeit.lesson15.clon.Car;
import com.freeit.lesson15.clon.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollections {

    static List<User> sList = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        List<User> users = Collections.synchronizedList(sList);


        List<User> users1 = new ArrayList<>();

        sList.add(new User("Vasili"));

        new Thread(() -> {
            while (true) {
                System.out.println(users.get(0));
            }
        }).start();

        new Thread(() -> {
           boolean isAdd = false;
           while (true) {
               try {
                   Thread.sleep(1);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               User user = users.get(0);
                if(isAdd) {
                    user.setName(user.getName() + "_test");
                    user.setCar(new Car(2002, "brand", "model"));
                    isAdd = false;
                } else {
                    user.setName(user.getName().replace("_test", ""));
                    user.setCar(null);
                    isAdd = true;
                }
            }
       }).start();

    }
}
