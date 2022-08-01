package com.polozov.mainCourseJava.lesson07.modoficators;

public class MainApp {
    public static void main(String[] args) {
        Technic t = new Technic(700, 1500, "Japan", "electric pipeline");
        Computer c = new Computer("HP", "B570");

        c.setBrand("Lenovo");
        System.out.println(c.getBrand());

        t.showProperties();
    }
}
