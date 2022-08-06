package com.freeit.lesson19.exceptions;

import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public final class ExceptionsExample {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Server is working");
            }
        });
        thread.setDaemon(true);
        thread.start();

        System.out.println("Enter delimeter");
        Integer delimeter = new Scanner(System.in).nextInt();
        int a = 100;
        try {
            devider(a, delimeter);
        } catch (ZeroException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Something goes wrong. Try one more time lease... \n" + e.getMessage());
        }
        System.out.println("Program finished successfully!");
    }

    public static void devider(int a, int delimeter) throws ZeroException {
        devider2(a, delimeter);
    }

    private static void devider2(int a, int delimeter) throws ZeroException {
        if(delimeter == 0) {
            throw new ZeroException("You divider is equal to zero. Please choose another one gr than 0");
        }
//        try {
//            System.out.println("Ваш коэфициент соответствия: " + (a / delimeter));
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new ZeroException("You divider is equal to zero. Please choose another one gr than 0");
//        }
    }
}
