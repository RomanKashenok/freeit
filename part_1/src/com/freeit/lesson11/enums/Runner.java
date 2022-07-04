package com.freeit.lesson11.enums;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

//        Months[] months = Months.values();
//        for (int i = 0; i < months.length; i++) {
//            System.out.println(months[i]);
//        }

        Scanner SCANNER = new Scanner(System.in);
        System.out.println("enter month number: ");
        int month = SCANNER.nextInt();

        Months found = Months.getByOrdinal(month);

        found.whatsHappenning();

    }
}
