package com.polozov.mainCourseJava.lesson11.generics;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + ": Wow-wow!");
    }
}
