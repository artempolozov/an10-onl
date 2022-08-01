package com.polozov.mainCourseJava.lesson07.inheritance;

public class Truck extends Vehicle {

    static int staticProp1;
    static int staticProp2;

    int prop1;
    int prop2;

    {
        prop1 = 10;
        prop2 = 20;
    }

    static {
        staticProp1 = 5;
        staticProp2 = 6;
    }
}
