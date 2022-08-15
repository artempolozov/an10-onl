package com.polozov.mainCourseJava.lesson11.generics;

public class GenericFruitBox<T extends Fruit>{

    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
