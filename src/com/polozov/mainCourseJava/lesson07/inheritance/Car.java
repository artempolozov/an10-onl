package com.polozov.mainCourseJava.lesson07.inheritance;

public class Car extends Vehicle {

    static int staticProperty;
    static final int STATIC_FINAL_PROPERTY = 1_000_000;

    int property;


    public static void someMethod1(int x) {
        System.out.println(staticProperty);
        System.out.println("1st method");
    }

    public void someMethod2(int y) {
        System.out.println(this.property);
        System.out.println(staticProperty);
        System.out.println("2nd method");
    }
}
