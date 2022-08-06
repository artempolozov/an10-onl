package com.polozov.mainCourseJava.lesson08;

public interface Drawable {

    int SIZE = 10;
    int LINE_SIZE = 2;

    void draw();

    default void hide() {
        System.out.println("Нарисованный объект скрыт");
        someMethod();
    }

    private void someMethod() {
        System.out.println("Do something" + SIZE);
    }

    static void someStaticMethod() {
        System.out.println("Do some static" + LINE_SIZE);
    }
}
