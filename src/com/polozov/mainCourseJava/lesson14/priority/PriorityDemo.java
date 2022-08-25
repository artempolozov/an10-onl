package com.polozov.mainCourseJava.lesson14.priority;

public class PriorityDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(PriorityDemo::printCycle);
        Thread t2 = new Thread(PriorityDemo::printCycle);

        t1.setName("A-tread");
        t2.setName("B-tread");
        Thread.currentThread().setName("M-thread");

        t1.setPriority(10);
        t2.setPriority(1);

        t1.start();
        t2.start();
        printCycle();
    }

    public static void printCycle() {
        for (int i = 0; i < 50; i++) {
            System.out.println(
                    Thread.currentThread().getName() + " - Priority: " +
                            Thread.currentThread().getPriority() + " - " + i);
        }
    }
}
