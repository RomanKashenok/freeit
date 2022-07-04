package com.freeit.lesson11;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {

//        String s = "rt ybn yui vb il";
//        String[] splitted = s.split(" ");
//        System.out.println(splitted);

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
                "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in " +
                "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui " +
                "officia deserunt mollit anim id est laborum.";

        StringTokenizer st = new StringTokenizer(text, " ,.");
        System.out.println(st.countTokens());

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
