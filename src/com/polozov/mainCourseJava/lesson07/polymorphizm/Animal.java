package com.polozov.mainCourseJava.lesson07.polymorphizm;

public class Animal {

    static {
        System.out.println("ANIMAL: static block");
    }

    {
        System.out.println("ANIMAL: initialize block");
    }

    public static void someMethod() {
        System.out.println("ANIMAL: static method");
    }

    public Animal() {
        System.out.println("ANIMAL: constructor");
    }

    public void sound() {
        System.out.println("There is no sound");
    }
}
