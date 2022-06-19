package com.freeit.lesson4;

public class TypesCasting {
    public static void main(String[] args) {

        // byte short int long
        byte b = (byte) 127;    // -128 - 127
        short s = 5;            // 5
        int i = 5;              // 5
        long l = 5;             // 5
        float f = 0.5f;         // 0.7f
        double d = 0.5;         // 0.5

        String s1 = "test";

        System.out.println(s1 + (b + s) + s1);

    }
}
