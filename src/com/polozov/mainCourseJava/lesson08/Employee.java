package com.polozov.mainCourseJava.lesson08;

public class Employee extends Person {
    private String profession;
    private int workExperience;
    private int salary;

    public Employee(String name,
                    String surname,
                    int age,
                    String language,
                    String sex,
                    String profession,
                    int workExperience,
                    int salary) {
        super(name, surname, age, language, sex);
        this.profession = profession;
        this.workExperience = workExperience;
        this.salary = salary;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public void doSomething() {
        System.out.println("Do boring job");
    }
}
