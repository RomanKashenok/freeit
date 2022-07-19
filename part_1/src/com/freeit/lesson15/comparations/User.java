package com.freeit.lesson15.comparations;

import java.util.Comparator;

public final class User /*implements Comparable<User>, Comparator<User>*/ {

    private String name;

    public User() {
        this.name = "";
    }

    public User(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
/*
    @Override
    public int compare(User user1, User user2) {
        return user1.getName().length() - user2.getName().length();
    }

    @Override
    public int compareTo(User user) {
        return this.name.length() - user.getName().length();
    }*/
}
