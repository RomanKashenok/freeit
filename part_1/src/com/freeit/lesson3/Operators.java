package com.freeit.lesson3;

import org.w3c.dom.ls.LSOutput;
/**
 * Условие задачи:
 *
 * */
public class Operators {

    public static void main(String[] args) {
        // 1- arithmetical
        /**
         * + - overrided for rows
         * - - not overrided at all
         * /
         * *
         * */
        int result1 = 4 + 1;
        int result2 = result1++;
        result2+=6;
        int result3 = ++result1;

//        int a = 5;
//        System.out.print(a);
//        System.out.print(a++);
//        System.out.print(a);
//        System.out.print(++a);
//        System.out.print(a);
//
//        System.out.println();
//
//        System.out.print(a);
//        System.out.print(a--);
//        System.out.print(a);
//        System.out.print(--a);
//        System.out.print(a);

        // / - division
        int a = 10;
        int b = 7;
        int c = 2;
        float f = 7.0f;
//        System.out.println(f);
//        f/=2;
//        System.out.println(f);
//        System.out.println(b);
//        System.out.println(a / c);
//        System.out.println(a / f);

        // %
//        System.out.println(a % b);


        // Comparison
        /**
         * >
         * <
         * ==
         * >=
         * <=
         * !=
         * */
//        System.out.println(a != b);

        // Logical
        // | - or (full version)
        // || - or (shorted version)
        // & - and (full version)
        // && - and (shorted version)
        // ! - not
        boolean q = true;
//        System.out.println(q);
//        System.out.println(!q);

        if(a > b || c > b || b == f) {
            System.out.println("inside");
        }


    }

}
