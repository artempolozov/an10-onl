package com.polozov.mainCourseJava.lesson14.synchronize.example2;


public class Consumer extends Thread {

    private String fullName;
    private Warehouse warehouseInformation;
    private int products;

    public Consumer(String fullName, Warehouse warehouseInformation) {
        this.fullName = fullName;
        this.warehouseInformation = warehouseInformation;
        this.products = 0;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100_000; i++) {
            warehouseInformation.getSomeProduct();
        }
    }

    public void showInformation() {
        System.out.println(fullName + " has " + products + " products");

    }
}
