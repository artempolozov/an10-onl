package com.polozov.mainCourseJava.lesson09.myExceptions;

public class MyExceptionDemo {
    public static void main(String[] args) {
        myException1(50);
        myException1(200);
    }

    public static void myException1(int number) {
        try {
            if (number > 100) {
                throw new MyException("Wrong number", number);
            }
        } catch (Exception e) {
            System.err.println("Exception: " + e);
        }
    }
}
