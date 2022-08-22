package com.polozov.mainCourseJava.lesson13.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo2 {
    public static void main(String[] args) {
        YearChecker<Person> ageChecker = p -> p.getAge() >= 18;
        List<Person> personList = List.of(
                new Person(10, "Robert"),
                new Person(20, "Phillip"),
                new Person(30, "Tom"),
                new Person(40, "Michel")
        );

        System.out.println(getNameListForAdultPerson(personList, ageChecker));

        PersonFactory factory = Person::new;
        Person sonya = factory.createPerson(50, "Sonya");
        System.out.println(sonya);

        AddingStringData adding1 = sonya::addSurname;
        AddingStringData adding2 = sonya::setLastname;

        System.out.println(sonya.getFullInfo());
        adding1.addData("Mc'Away");
        adding2.addData("Johan");
        System.out.println(sonya.getFullInfo());
    }

    public static List<String> getNameListForAdultPerson(List<Person> people, YearChecker<Person> checker) {
        List<String> names = new ArrayList<>();
        for (Person p : people) {
            if (checker.checkYear(p)) {
                names.add(p.getName());
            }
        }
        return names;
    }
}
