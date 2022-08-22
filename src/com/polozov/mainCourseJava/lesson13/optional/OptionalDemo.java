package com.polozov.mainCourseJava.lesson13.optional;

import com.polozov.mainCourseJava.lesson13.lambda.Person;

import java.util.Optional;

public class OptionalDemo {
    private static Optional<Person> optional1;

    public static void main(String[] args) {
        Person person1 = new Person(100, "Cristian");
        Person person2 = null;


        Optional<Person> optional1 = Optional.ofNullable(person1);
        Optional<Person> optional2 = Optional.ofNullable(person2);

        optional1.ifPresentOrElse(
                System.out::println,
                () -> System.out.print("Empty person")
        );

        optional2.ifPresentOrElse(
                System.out::println,
                () -> System.out.print("Empty person")
        );


        System.out.println("----------------");
        optional1.ifPresent(p -> System.out.println(p.getFullInfo()));
        System.out.println("----------------");
        optional2.ifPresent(p -> System.out.println(p.getFullInfo()));
        System.out.println("----------------");


        System.out.println(optional1.get().getFullInfo());

    }
}
