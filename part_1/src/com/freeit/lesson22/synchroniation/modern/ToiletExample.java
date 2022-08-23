package com.freeit.lesson22.synchroniation.modern;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class ToiletExample {

    private final static Semaphore toiletGuardian = new Semaphore(5);
    private final static CountDownLatch sportToiletGuardian = new CountDownLatch(10);

    private final static CyclicBarrier carrierToiletGuardian = new CyclicBarrier(4, () -> {
        System.out.println("THat's what you should do before you can enter!");
        try {
            podnyatCheta();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });

    private static void podnyatCheta() throws InterruptedException {
        System.out.println("Podnimaen...");
        Thread.sleep(1000);
        System.out.println("Podnyali...");
    }

    private final static Random rand = new Random();

    public static void main(String[] args) throws InterruptedException {

//        for (int i = 0; i < 17; i++) {
//            new Thread(() -> {
//                try {
//                    System.out.println("Thread : " + Thread.currentThread().getName() + " подошел к toiletGuardian");
//                    toiletGuardian.acquire();
//                    System.out.println("Enter granted for: " + Thread.currentThread().getName());
//                    Thread.sleep(rand.nextInt(5000) + 1000);
//                    System.out.println("Thread " + Thread.currentThread().getName() + " finished");
//                    toiletGuardian.release();
//                } catch (InterruptedException e) {
//                    System.out.println("Interrupted");
//                }
//            }, "chuvak " + i).start();
//        }

//        for (int i = 0; i < 17; i++) {
//            new Thread(() -> {
//                try {
//                    System.out.println("Thread : " + Thread.currentThread().getName() + " подошел к toiletGuardian");
//                    sportToiletGuardian.await();
//                    System.out.println("Enter granted for: " + Thread.currentThread().getName());
//                    Thread.sleep(rand.nextInt(5000) + 1000);
//                    System.out.println("Thread " + Thread.currentThread().getName() + " finished");
//                } catch (InterruptedException e) {
//                    System.out.println("Interrupted");
//                }
//            }, "chuvak " + i).start();
//        }
//
//        Thread.sleep(1000);
//
//        System.out.println("Вы будете стоять тут, пока я не присяду 10 раз!!!!");
//        long count = sportToiletGuardian.getCount();
//        for (int i = 1; i <= count; i++) {
//            System.out.println("Guardian makes squad #" + i);
//            sportToiletGuardian.countDown();
//            Thread.sleep(1000);
//        }

        for (int i = 0; i < 17; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(rand.nextInt(3000) + 1000);
                    System.out.println("Thread : " + Thread.currentThread().getName() + " подошел к toiletGuardian");
                    carrierToiletGuardian.await();
                    System.out.println("Enter granted for: " + Thread.currentThread().getName());
                    Thread.sleep(rand.nextInt(5000) + 1000);
                    System.out.println("Thread " + Thread.currentThread().getName() + " finished");
                } catch (Exception e) {
                    System.out.println("Something goes wrong: " + e);
                }
            }, "chuvak " + i).start();
        }

    }
}
