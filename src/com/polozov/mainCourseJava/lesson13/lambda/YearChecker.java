package com.polozov.mainCourseJava.lesson13.lambda;

@FunctionalInterface
public interface YearChecker<T> {
    boolean checkYear(T t);
}
