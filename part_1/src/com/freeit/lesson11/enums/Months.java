package com.freeit.lesson11.enums;

import java.util.Arrays;

public enum Months {
    JANUARY(1, "jan", new Thread(() -> {
        System.out.println("january...");
        for (int i = 0; i < 4; i++) {
            try {
                System.out.println("Snow is going....");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    })),
    FEBRUARY(2, "frb", new Thread(() -> {
        System.out.println("february...");
        for (int i = 0; i < 4; i++) {
            try {
                System.out.println("Snow is going....");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    })),
    MARCH(3, "mar", null),
    APRIL(4, "apr", null),
    MAY(5, "may", null),
    JUNE(6, "june", null),
    JULY(7, "jule", null),
    AUGUST(8, "aug", null),
    SEPTEMBER(9, "sep", new Thread(() -> {
        System.out.println("september...");
        for (int i = 0; i < 4; i++) {
            try {
                System.out.println("Leaves is falling....");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    })),
    OCTOBER(10, "oct", new Thread(() -> {
        System.out.println("october...");
        for (int i = 0; i < 4; i++) {
            try {
                System.out.println("Leaves is falling....");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    })),
    NOVEMBER(11, "nov", new Thread(() -> {
        System.out.println("november...");
        for (int i = 0; i < 4; i++) {
            try {
                System.out.println("Leaves is falling....");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    })),
    DECEMBER(12, "dec", new Thread(() -> {
        System.out.println("december...");
        for (int i = 0; i < 4; i++) {
            try {
                System.out.println("Snow is going....");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }));
    private int ord;
    private String val;

    private Thread task;

    Months(int ord, String val, Thread task) {
        this.ord = ord;
        this.val = val;
        this.task = task;
    }


    public static Months getByOrdinal(int ord) {
        return Arrays.asList(Months.values())
                .stream()
                .filter(it -> it.ord == ord)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Entered month ordinal is not valid!"));
    }

    public void whatsHappenning() {
        task.start();
    }
}
