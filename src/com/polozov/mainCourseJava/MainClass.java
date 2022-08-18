package com.polozov.mainCourseJava;

import com.polozov.mainCourseJava.lesson08.Printable;
import com.polozov.mainCourseJava.lesson12.Drawer;
import com.polozov.mainCourseJava.lesson12.entity.Human;

public class MainClass {
    public static void main(String[] args) {
        Printable object1 = new Printable() {
            @Override
            public void print() {
                System.out.println("Simple print");
            }

            @Override
            public void print(int x, int y) {
                System.out.println("Print by X and Y");
            }

            @Override
            public void fillColor(String color) {
                System.out.println("Fill some color");
            }
        };

        object1.print();
        object1.print(5, 7);

        Drawer drawer = new Drawer("Michel", new Printable() {
            @Override
            public void print() {
                System.out.println("Simple print");
            }

            @Override
            public void print(int x, int y) {
                System.out.println("Print by X and Y");
            }

            @Override
            public void fillColor(String color) {
                System.out.println("Fill some color");
            }
        });

        drawer.getPrintable().fillColor("GREEN");

        Human human = new Human("Collin") {
            @Override
            public String getName() {
                return super.getName();
            }

            @Override
            public void setName(String name) {
                super.setName(name);
            }

            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }
        };
    }
}
