package com.polozov.mainCourseJava.lesson08;

public class Student extends Person {
    private String university;
    private double rate;

    public Student(String name,
                   String surname,
                   int age,
                   String language,
                   String sex,
                   String university,
                   double rate) {
        super(name, surname, age, language, sex);
        this.university = university;
        this.rate = rate;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void doSomething() {
        System.out.println("Stupid studying");
    }
}
