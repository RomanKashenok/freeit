package com.freeit.lesson6;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        // Modifiers -> Type -> name -> assigning value

        String [] clazzJournal = new String[7];
        clazzJournal[0] = "Ilya";
        clazzJournal[1] = "Ivan";
        clazzJournal[2] = "Sasha";
        clazzJournal[3] = "Maria";
        clazzJournal[4] = "Artem";
        clazzJournal[5] = "Roman";
        clazzJournal[6] = "Nastya";

        for (int i = 0; i < clazzJournal.length; i++) {
            System.out.println(clazzJournal[i]);
            if(i % 4 == 0) {
                clazzJournal[i] = null;
            }
        }

//        char [] charArr = new char[10];
//
//        for (int i = 0; i <charArr.length; i++) {
//            charArr[i] = (char) (80 + i);
//            System.out.println(charArr[i]);
//        }

        // Discipline - Math
        // cells - marks
        // Target - avg mark

        Random rand = new Random();

//        int [] [] marks = new int[4][];
//        for (int i = 0; i < marks.length; i++) {
//            marks[i] = new int[rand.nextInt(3) + 3];
//
//            for (int i1 = 0; i1 < marks[i].length; i1++) {
//                marks[i][i1] = rand.nextInt(9) + 1;
//                System.out.print(marks[i][i1] + " ");
//            }
//
//            System.out.println();
//        }
//
//        int size = rand.nextInt(5) + 4;
//        int [] [] arr = new int[size][size];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = 8;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + "  ");
//            }
//            System.out.println();
//        }
    }
}
