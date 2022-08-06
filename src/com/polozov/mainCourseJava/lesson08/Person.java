package com.polozov.mainCourseJava.lesson08;

import java.util.Objects;

public abstract class Person {
    private String name;
    private String surname;
    private int age;
    private String language;
    private String sex;

    public Person(String name, String surname, int age, String language, String sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.language = language;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getLanguage() {
        return language;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(language, person.language) && Objects.equals(sex, person.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, language, sex);
    }

    public abstract void doSomething();
}
