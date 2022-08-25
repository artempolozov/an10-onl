package com.polozov.mainCourseJava.lesson14.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {

    private static AtomicInteger COUNT = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 500_000; i++) {
                COUNT.incrementAndGet();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 500_000; i++) {
                COUNT.incrementAndGet();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(COUNT);
    }
}
