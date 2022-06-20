package com.freeit.lesson5;

import java.util.Random;

// https://t.me/+92ZDNln10lY2Yzg6

public class Cycles {
    public static void main(String[] args) throws InterruptedException {

        // 1 - начальное значение счетчика
        // 2 - условие до которого мы "крутим" цикл
        // 3 - условие изменения значения счетчика (переключение счетчика)

//        int counter = 0;
//        boolean isValid = true;

//        for(; isValid ;) {
//            System.out.println("in cycle " + counter);
//            counter++;
//            isValid = counter < 10;
//        }

//        while(isValid) {
//            System.out.println("in cycle " + counter);
//            counter++;
//            isValid = counter < 10;
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println("*I) inside 'i' cycle: " + i);
//            for (int j = 0; j < 10; j++) {
//                if(j == 2) break;
//                System.out.println("***J) inside 'j' cycle: " + j);
//                for (int k = 0; k < 10; k++) {
//                    if(k == 3) break;
//                    System.out.println("******K) inside 'k' cycle: " + k);
//                }
//            }
//        }

//        while (isValidUser()) {
//            Thread.sleep(1000);
//            System.out.println("I want to offer you iPhone 15 for 125$");
//        }

//        do {
//            Thread.sleep(1000);
//            System.out.println("I want to offer you iPhone 15 for 125$");
//        } while (isValidUser());


        // Cycle operators

//        for (int i = 14; true; i++) {
//            System.out.println(i);
//            if(i % 13 == 0) {
//                System.out.println("Оппа, трюлик ))");
//                break;
//            }
//        }
//        getTxt();
//        System.out.println(getTxt());

//        int salt = 40;
//        String password = "SpongeBobSquarePants";
//        StringBuilder sb = new StringBuilder();
//
//        for(char c : password.toCharArray()) {
//            sb.append((char)(c + salt));
//        }
//        String secretPassword = sb.toString();
//        System.out.println(secretPassword);
//
//        sb = new StringBuilder();
//        for(char c : secretPassword.toCharArray()) {
//            sb.append((char)(c - salt));
//        }
//
//        String recoveredPassword = sb.toString();
//        System.out.println(recoveredPassword);

        // ?:
        int a = 5;
        String number = a == 5
                ? "Five"
                : "Not five";
        System.out.println(number);
    }

//    private static void getTxt() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("*I) inside 'i' cycle: " + i);
//            for (int j = 0; j < 10; j++) {
//                System.out.println("***J) inside 'j' cycle: " + j);
//                for (int k = 0; k < 10; k++) {
//                    System.out.println("******K) inside 'k' cycle: " + k);
//                }
//                if(j == 4) {
//                    return;
//                }
//            }
//        }
//    }

//    private static boolean isValidUser() {
//        System.out.println("User validation requested...");
//        boolean isValid = new Random().nextBoolean();
//        System.out.println("User is valid: " + isValid);
//        return isValid;
//    }
}
