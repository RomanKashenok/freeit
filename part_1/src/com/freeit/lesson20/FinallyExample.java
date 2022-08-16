package com.freeit.lesson20;

import java.io.*;

public class FinallyExample {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        File f = new File("test.txt");
//        OutputStream fos = new FileOutputStream(f);

        Thread t = new Thread(() -> {
            try (OutputStream fos = new FileOutputStream(f)) {
                for (int i = 0; i < 100; i++) {
                    fos.write(i + 52);
                    System.out.println("i: " + i);
                    Thread.sleep(500);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        t.start();
        Thread.sleep(1000);
        t.interrupt();
        Thread.sleep(30000);


    }
}
