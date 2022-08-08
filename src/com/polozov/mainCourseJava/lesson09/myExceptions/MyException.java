package com.polozov.mainCourseJava.lesson09.myExceptions;

public class MyException extends Exception {
    private int someNumber;

    public MyException(String message, int someNumber) {
        super(message);
        this.someNumber = someNumber;
    }

    public MyException(int someNumber) {
        this.someNumber = someNumber;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "someNumber=" + someNumber + " " +
                (getMessage().isEmpty() ? "" : getMessage()) +
                '}';
    }
}
