package com.polozov.mainCourseJava.lesson11.generics;

public abstract class Fruit {
    private String country;

    public Fruit(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
