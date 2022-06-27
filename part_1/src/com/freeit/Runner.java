package com.freeit;

import java.util.Random;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = 21;
        int n;

        if (x % 100 >= 11 && x % 100 <= 14) {
            System.out.println(x + " рублей");
        } else {
            n = x % 10;
            switch (n) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println(x + " рублей");
                    break;
                case 1:
                    System.out.println(x + " рубль");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(x + " рубля");
                    break;
            }
        }
    }
}
