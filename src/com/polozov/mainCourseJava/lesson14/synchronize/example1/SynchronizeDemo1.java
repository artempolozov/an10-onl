package com.polozov.mainCourseJava.lesson14.synchronize.example1;

public class SynchronizeDemo1 {
    public static void main(String[] args) throws InterruptedException {
        SomeClass sc = new SomeClass();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 500_000; i++) {
                sc.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 500_000; i++) {
                sc.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(sc.getSomeVar());
    }
}
