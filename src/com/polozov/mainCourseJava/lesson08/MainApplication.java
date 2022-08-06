package com.polozov.mainCourseJava.lesson08;

public class MainApplication {
    public static void main(String[] args) {
        ActionPlace coworking = new ActionPlace("Chill place");

        Person p1 = new Employee("name1", "surname1", 101, "ru", "F", "profession1", 80, 10000);
        Person p2 = new Employee("name2", "surname2", 102, "ru", "M", "profession2", 80, 10000);

        Person s1 = new Student("name1", "surname1", 101, "ru", "F", "university1", 10);
        Person s2 = new Student("name2", "surname2", 102, "ru", "M", "university2", 9);


        coworking.addPerson(s1);
        coworking.addPerson(s2);
        coworking.addPerson(p1);
        coworking.addPerson(p2);

        coworking.makeSomething();
    }
}
