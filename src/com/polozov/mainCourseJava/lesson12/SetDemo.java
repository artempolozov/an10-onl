package com.polozov.mainCourseJava.lesson12;

import com.polozov.mainCourseJava.lesson12.entity.Animal;
import com.polozov.mainCourseJava.lesson12.entity.Person;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        // TreeSet
        TreeSet<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(new Person("Jim", 100));
        printSet(personTreeSet);

        TreeSet<Animal> animalTreeSet = new TreeSet<>(new AnimalComparator());
        animalTreeSet.add(new Animal("Pluto", "dog", 10));
        printSet(animalTreeSet);

        // HashSet
        HashSet<String> strings = new HashSet<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        strings.add("first");
        printSet(strings);

        HashSet<Person> personHashSet = new HashSet<>();
        personHashSet.add(new Person("Bill", 100));
        personHashSet.add(new Person("Tom", 90));
        personHashSet.add(new Person("Carlos", 80));
        personHashSet.add(new Person("Bill", 100));
        printSet(personHashSet);

        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("first");
        stringSet.add("second");
        stringSet.add("third");
        printSet(stringSet);

        // Задача: найти все уникальные элементы в списке
        List<String> elements = List.of("aaa", "bbb", "cccc", "ddd", "aaa", "bbb", "cccc", "ddd", "aaa", "bbb", "cccc", "ddd");
        System.out.println(elements);
        printSet(new HashSet<>(elements));
    }

    private static <T> void printSet(Set<T> set) {
        for (T t : set) {
            System.out.println(t);
        }
        System.out.println("---------------------------------");
    }
}
