package com.polozov.mainCourseJava.lesson08;

public class Circle implements Printable {
    @Override
    public void print() {
        System.out.println("Рисуем круг");
    }

    @Override
    public void print(int x, int y) {
        System.out.println("Рисуем круг радиусом " + x);
    }

    @Override
    public void fillColor(String color) {
        System.out.println("Заливаем круг цветом: " + color);
    }
}
