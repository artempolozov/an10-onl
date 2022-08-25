package com.polozov.mainCourseJava.lesson14.synchronize.example1;

public class SomeClass {
    private int someVar = 0;

    private Object o = new Object();

    public int getSomeVar() {
        return someVar;
    }

    public void increment() {
        synchronized (o) {
            someVar++;
        }
    }
}
