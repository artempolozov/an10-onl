package com.polozov.mainCourseJava.lesson13.func;

import java.util.ArrayList;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Printable printable1 = new Printable() {
            @Override
            public void print(Object o) {
                System.out.println("Some printing-1");
            }
        };

        Printable printable2 = o -> System.out.println("Some printing-2");

        printable1.print(new ArrayList<>());
        printable2.print(new ArrayList<>());
    }
}
