package com.polozov.mainCourseJava.lesson07.polymorphizm;

public class Ukraine extends Country {

    public Ukraine(String capital, int population) {
        super(capital, population);
    }

    @Override
    public String getMainInformation() {
        return "Самая интересная страна Украина со столицей в городе " + getCapital();
    }
}
