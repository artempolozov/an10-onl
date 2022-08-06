package com.polozov.mainCourseJava.lesson08;

public class Square implements Sizable {
    @Override
    public void draw() {
        System.out.println("Drawable: draw square");
    }

    @Override
    public void reduceSize() {
        System.out.println("Sizable: reduce square");
    }
}
