package com.polozov.mainCourseJava.lesson07.polymorphizm;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Country c1 = new Belarus("Минск", 1_000_000_000);
        Country c2 = new Russia("Москва", 1_000_000_000);
        Country c3 = new Ukraine("Киев", 1_000_000_000);
        Country c4 = new Japan("Токио", 1_000_000_000);

        Country[] countries = {c1, c2, c3, c4};

        for (Country c : countries) {
            System.out.println(c.getMainInformation());
        }


//        Animal a2 = new Dog();
//        Animal a3 = new Cat();
//        Animal a4 = new Duck();

        Dog.someMethod2();


//        a2.sound();
//        a3.sound();
//        a4.sound();


    }
}
