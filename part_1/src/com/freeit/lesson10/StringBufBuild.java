package com.freeit.lesson10;

import java.util.Scanner;

public class StringBufBuild {
    public static void main(String[] args) {

        StringBuilder sbl = new StringBuilder();
        StringBuffer sbf = new StringBuffer();

        sbl.append("Hello, ");
        sbf.append("Hello, ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sbl.append(name);
        sbf.append(name);

        String s1 = sbl.toString();
        String s2 = sbf.toString();

        System.out.println();
    }
}
