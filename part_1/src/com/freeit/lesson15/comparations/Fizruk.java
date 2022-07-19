package com.freeit.lesson15.comparations;

import java.util.Comparator;

public class Fizruk implements Comparator<User> {

    @Override
    public int compare(User user1, User user2) {
        return user1.getName().length() - user2.getName().length();
    }
}
