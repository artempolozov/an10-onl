package com.polozov.mainCourseJava.lesson14.threads;

public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt1 = new MyThread();
        mt1.start();

        Thread mt2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        mt2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            Thread.sleep(500);
        }
    }
}
