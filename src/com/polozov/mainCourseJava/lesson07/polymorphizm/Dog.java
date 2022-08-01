package com.polozov.mainCourseJava.lesson07.polymorphizm;

public class Dog extends Animal {

    static {
        System.out.println("DOG: static block");
    }

    {
        System.out.println("DOG: initialize block");
    }

    public static void someMethod2() {
        System.out.println("DOG: static method");
    }

    public Dog() {
        System.out.println("DOG: constructor");
    }

    @Override
    public void sound() {
        System.out.println("Wow-wow!");
    }
}
