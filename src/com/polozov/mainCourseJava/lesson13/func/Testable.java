package com.polozov.mainCourseJava.lesson13.func;

@FunctionalInterface
public interface Testable<T> {
    void test(T t);

    default void prepare(T t) {
        System.out.println("Some preparing....");
    }
}
