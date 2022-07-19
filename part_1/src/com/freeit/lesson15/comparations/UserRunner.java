package com.freeit.lesson15.comparations;

import java.util.*;

public class UserRunner {
    public static void main(String[] args) {

        final Random rand = new Random();

        List<User> users = new ArrayList<>();
        List<String> userNames = new ArrayList<>();

        for (int i = 0; i < 31; i++) {
            String uuid = UUID.randomUUID().toString();
            User user = new User(uuid.toCharArray()[uuid.length() % (i + 1)]
                    + "_user"
                    + uuid.substring(0, rand.nextInt(uuid.length())));
            users.add(user);
//            userNames.add(user.getName());
//            System.out.println(user.getName());
            System.out.println(user);
        }

//        Collections.sort(userNames);
        Collections.sort(users, Comparator.comparingInt(a -> a.getName().length()));
        System.out.println("******* After sorting");
//        for (int i = 0; i < userNames.size(); i++) {
//            System.out.println(userNames.get(i));
//        }

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }
}
