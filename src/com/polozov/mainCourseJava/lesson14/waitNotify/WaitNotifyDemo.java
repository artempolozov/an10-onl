package com.polozov.mainCourseJava.lesson14.waitNotify;

import java.util.concurrent.atomic.AtomicInteger;

public class WaitNotifyDemo {
    public static void main(String[] args) {
        Watch watch = new Watch();

        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                watch.printTik();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                watch.printTak();
            }
        }).start();
    }
}
