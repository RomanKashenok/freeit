package com.freeit.lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class IfElseSwitchOperators {

    private static String[] maleNames = {"Ilya", "Raman", "Artem", "Dzmitry", "Anton", "Vasya", "Kirill"};
    private static Random rand = new Random();

    public static void main(String[] args) {

        //  if, if-else (if - else if - else)
        // switch-case

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = sc.nextLine();
//        System.out.println("Enter your age: ");
//        int age = sc.nextInt();
//
//        if(!isAgeValid(age)) {
//            System.out.println("Тебе еще рано");
//        } else {
//            System.out.println("Приветствую тебя путник(ца)");
//            if (isMale(name)) {
//                System.out.println("Вжарим по пивку?");
//            } else if (!isMale(name) && getRandomBool()) {
//                System.out.println("Налей/те себе/вам сам/о/а/и");
//            } else {
//                System.out.println("Может бокальчик игристого?");
//            }
//        }

        printDayWithIf(2);
        printDayWithSwitch(41);

        System.out.println("Программа завершена успешно!");
    }


    private static void printDayWithIf(int n) {
        if (n == 1) {
            System.out.println("Mon");
        } else if (n == 2) {
            System.out.println("Tue");
        } else if (n == 3) {
            System.out.println("Wed");
        } else if (n == 4) {
            System.out.println("Thu");
        } else if (n == 5) {
            System.out.println("Fri");
        } else if (n == 6) {
            System.out.println("Sat");
        } else if (n == 7) {
            System.out.println("Sun");
        } else {
            System.out.println("Нет такого дня недели");
        }
    }

    private static void printDayWithSwitch(int n) {
        switch (n) {
            case 1, 2, 3, 4, 5 -> System.out.println("Привет!");
            case 6, 7 -> System.out.println("Здравствуйте!");
            default -> System.out.println("ХАй");
        }
    }


    private static boolean isAgeValid(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isMale(String name) {
        List<String> males = Arrays.asList(maleNames);
        if (males.contains(name)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean getRandomBool() {
        return rand.nextBoolean();
    }


}
