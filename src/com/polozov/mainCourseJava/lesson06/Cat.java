package com.polozov.mainCourseJava.lesson06;

class Cat {
    String name;
    int age;
    String breed;
    String color;
    boolean isAngry;

    public Cat() {
    }

    public Cat(String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    public Cat(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }


    public Cat(String name, int age, String breed, String color, boolean isAngry) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.isAngry = isAngry;
    }

    public void sleep() {
        System.out.println("Спит (" + calculateSleepingHours() + ") часов...");
    }

    public void eat(String someFood) {
        System.out.println("Ест " + someFood + "...");
    }

    public void play() {
        System.out.println("Играет...");
    }

    public int calculateSleepingHours() {
        return (int) (Math.random() * 8);
    }
}

