package com.polozov.mainCourseJava.lesson12;

import com.polozov.mainCourseJava.lesson12.entity.Animal;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
