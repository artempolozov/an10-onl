package com.polozov.mainCourseJava.lesson14.synchronize.example2;

public class Warehouse {
    private int productCount;
    private int portion;

    public Warehouse(int productCount) {
        this.productCount = productCount;
        this.portion = 10;
    }

    public void getSomeProduct() {
        synchronized (this) {
            productCount -= portion;
        }
    }

    public int getProductCount() {
        return productCount;
    }

    public int getPortion() {
        return portion;
    }
}
