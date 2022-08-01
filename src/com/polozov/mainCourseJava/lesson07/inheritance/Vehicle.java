package com.polozov.mainCourseJava.lesson07.inheritance;

public class Vehicle {
    String mark;
    String model;
    int yearOfCreation;
    String color;
    String engine;
    int price;
    String type;

    public Vehicle() {
    }

    public Vehicle(String mark, String model, int yearOfCreation, String color, String engine, int price, String type) {
        this.mark = mark;
        this.model = model;
        this.yearOfCreation = yearOfCreation;
        this.color = color;
        this.engine = engine;
        this.price = price;
        this.type = type;
    }

    public void move() {
        System.out.println("Машина в движении");
    }

    public void stop() {
        System.out.println("Машина остановлена");
    }
}
