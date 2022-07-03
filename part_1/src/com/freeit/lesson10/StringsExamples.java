package com.freeit.lesson10;

public class StringsExamples {
    public static void main(String[] args) {

        char[] chars = {'t', 'e', 's', 't'};

        String s1 = "test";
        String s2 = "te";
        String s3 = "st";
        String s4 = new String("test");
        String s5 = new String(chars);
        String s6 = s1;
        String s7 = s2 + s3;
        String s8 = s7;
        String s9 = s1.intern();
        String s10 = s4.intern();

        System.out.println(s1.equals(s4));   // true
        System.out.println(s1.equals(s6));   // true
        System.out.println(s1.equals(s9));   // true
        System.out.println(s1.equals(s7));   // true

        System.out.println(s4.equals(s5));   // true
        System.out.println(s4.equals(s7));   // true
        System.out.println(s4.equals(s10));  // true

        System.out.println(s10.equals(s1));  // true
        System.out.println(s10.equals(s4));  // true
        System.out.println(s9.equals(s10));  // true


    }
}
