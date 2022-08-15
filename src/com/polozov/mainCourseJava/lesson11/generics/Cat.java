package com.polozov.mainCourseJava.lesson11.generics;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + ": Meow!");
    }
}
