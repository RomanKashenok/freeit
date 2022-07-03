package com.freeit.lesson10;

public class Regexp {
    public static void main(String[] args) {

        String text = "A few moments later test, my name is London is the capital of Great Britain";

        String regex = "^[A-Z].+";

        boolean matches = text.matches(regex);
        System.out.println(matches);
    }
}
