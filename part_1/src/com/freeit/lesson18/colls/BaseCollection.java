package com.freeit.lesson18.colls;

import com.freeit.lesson15.clon.Car;

import java.util.*;

public class BaseCollection {

    public static void main(String[] args) {
//        List<Integer> ints = new ArrayList<>();
//        List<Integer> ints2 = new LinkedList<>();
//
//        ints.add(5);
//        ints.add(6);
//        ints.add(7);
//        ints.add(8);
//        ints.add(9);
//        ints.add(2, 10);
//
//        ints2.add(5);
//        ints2.add(6);
//        ints2.add(7);
//        ints2.add(8);
//        ints2.add(9);
//        ints2.add(2, 10);
//
//        System.out.println(ints);
//        System.out.println(ints2);
//
//        System.out.println(ints.size());
//        System.out.println(ints2.size());
//
//        System.out.println(ints.contains(6));
//        System.out.println(ints2.contains(7));

        Set <Car> set1 = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            int i1 = new Random().nextInt(10) + 10;
            set1.add(new Car(2000 + i1, "Suzuki", "swift"));
            System.out.println(i1);
        }

//        set1.add(new Car(2002, "Suzuki", "swift"));

        System.out.println(set1);


        Map<String, Object> cars = new HashMap();
        Car car = new Car(2000, "Suzuki", "swift");
        Object mutex = new Object();

        for (int i = 0; i < 3; i++) {
            cars.put(UUID.randomUUID().toString(), mutex);
        }

        cars.put(UUID.randomUUID().toString(), mutex);
        cars.put(UUID.randomUUID().toString(), mutex);

        cars.forEach((k,v) -> System.out.println(v));

    }

}
