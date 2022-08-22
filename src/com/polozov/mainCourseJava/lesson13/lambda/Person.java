package com.polozov.mainCourseJava.lesson13.lambda;

import java.util.stream.Stream;

public class Person {
    private int age;
    private String name;
    private String surname;
    private String lastname;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public String getFullInfo() {
        return String.format("Name: %s\nSurname: %s\nLastname: %s\nAge: %d",
                this.name, this.surname, this.lastname, this.age);
    }

    public void addSurname(String surname) {
        this.surname = surname;
    }
}
