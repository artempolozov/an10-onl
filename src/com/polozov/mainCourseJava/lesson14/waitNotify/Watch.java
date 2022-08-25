package com.polozov.mainCourseJava.lesson14.waitNotify;

public class Watch {

    private boolean tikIsPrint = true;

    public synchronized void printTik() {
        while (!tikIsPrint) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print("TIK-");
        tikIsPrint = false;
        notify();
    }

    public synchronized void printTak() {
        while (tikIsPrint) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("TAK");
        tikIsPrint = true;
        notify();
    }
}
