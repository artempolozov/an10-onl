package com.polozov.mainCourseJava.lesson08;

public class Rectangle implements Printable {
    @Override
    public void print() {
        System.out.println("Рисуем прямоугольник");
    }

    @Override
    public void print(int x, int y) {
        System.out.println("Рисуем прямоугольник с координатами " + x + " и " + y);
    }

    @Override
    public void fillColor(String color) {
        System.out.println("Заливаем прямоугольник цветом: " + color);
    }

    public void print(int x, int y, int z) {
        System.out.println("Рисуем прямоугольник с координатами " + x + " и " + y + " и отступом " + z);
    }
}
