package com.polozov.mainCourseJava.lesson14.synchronize.example2;

import java.util.List;

public class SynchronizeDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Warehouse warehouse = new Warehouse(3_000_000);
        List<Consumer> consumers = List.of(
                new Consumer("Billy", warehouse),
                new Consumer("Edward", warehouse),
                new Consumer("Sophia", warehouse)
        );

        startThreads(consumers);
        joinThreads(consumers);
//        showAllInformation(consumers);

        System.out.println(warehouse.getProductCount());
    }

    private static void startThreads(List<Consumer> consumers) {
        for (Consumer c : consumers) {
            c.start();
        }
    }

    private static void joinThreads(List<Consumer> consumers) throws InterruptedException {
        for (Consumer c : consumers) {
            c.join();
        }
    }

    private static void showAllInformation(List<Consumer> consumers) {
        for (Consumer c : consumers) {
            c.showInformation();
        }
    }
}
