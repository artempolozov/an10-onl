package com.polozov.mainCourseJava.lesson06;

public class Person {
    String fullName;
    int age;

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.printf("%s куда-то идет", this.fullName);
    }

    public void talk() {
        System.out.printf("%s говорит", this.fullName);
    }
}
