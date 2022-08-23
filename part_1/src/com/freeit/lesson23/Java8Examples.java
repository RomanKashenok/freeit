package com.freeit.lesson23;

import com.freeit.lesson15.clon.User;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Examples {
    static Random rand = new Random();
    public static void main(String[] args) {
        String [] names = {"Вася", "Петя", "Таня", "Коля", "Надя", "Галя", "Саша", "Рома", "Женя"};

        List<User> users = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            users.add(new User("user_" + i));
        }
//
        String userToFound = "user_9987";
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < users.size(); i++) {
//            if(users.get(i).getName().equals(userToFound)) {
//                System.out.println("Hooray!");
//            }
//        }
//        System.out.println("1) time spent: " + (System.currentTimeMillis() - start));
//
//        start = System.currentTimeMillis();
//        Optional<User> found = users.stream().filter(user -> user.getName().equals(userToFound)).findFirst();
//        if(found.isPresent()) {
//            System.out.println("Hooray!");
//        }
//        System.out.println("2) time spent: " + (System.currentTimeMillis() - start));

//        System.out.println(users);

//        long start = System.currentTimeMillis();
//        for (int i = 0; i < users.size(); i++) {
//            User user = users.get(i);
//            user.setName(user.getName().replaceAll("user", names[rand.nextInt(names.length)]));
//        }
//
//        System.out.println("time spent: " + (System.currentTimeMillis() - start));
//        System.out.println(users);

        List<String> user1 = users.stream().map(user -> {
            User newUser = new User(user.getName());
            newUser.setName(user.getName().replaceAll("user", names[rand.nextInt(names.length)]));
            return newUser;
        }).map(user -> user.getName()).collect(Collectors.toList());

        System.out.println(user1);
        System.out.println(users);

    }
}
