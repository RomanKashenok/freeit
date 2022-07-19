package com.freeit.lesson14.initialization;

public class InitializationRunner {

    public static void main(String[] args) {
        Child child = new Child();


        // g = 1 h = 2
        // g = 1 h = 2
        // i = 3 j = 0 k = 5 l =
        // i = 3 j = 4 k = 5 l = 6
        // 6
        // ChildConstructor
        // g=1, h=2, i=3, j=4, k=5, l=6


        //Anna
        //a = 1 b = 0
        //a = 1 b = 2
        //c = 3 d = 0 e = 5 f =
        //c = 3 d = 4 e = 5 f = 0
        // g = 1 h = 2
        // g = 1 h = 2
        // i = 3 j = 0 k = 5 l =
        // i = 3 j = 4 k = 5 l = 6
        // 6
        // ChildConstructor
        // g=1, h=2, i=3, j=4, k=5, l=6
    }
}