package com.polozov.mainCourseJava.lesson07.inheritance;

public class Bike extends Vehicle {

    int wheels;

    public Bike() {
    }

    public Bike(String mark, String model, int yearOfCreation, String color, String engine, int price, String type, int wheels) {
        super(mark, model, yearOfCreation, color, engine, price, type);
        this.wheels = wheels;
    }

    public void championship() {
        System.out.println("Участвует в соревнованиях");
    }

    @Override
    public void move() {
        System.out.println("Мотоцикл беспечно уходит в закат...");
    }
}
