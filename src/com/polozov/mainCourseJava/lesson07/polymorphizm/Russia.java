package com.polozov.mainCourseJava.lesson07.polymorphizm;

public class Russia extends Country {

    public Russia(String capital, int population) {
        super(capital, population);
    }

    @Override
    public String getMainInformation() {
        return "Самая большая страна Россия со столицей в городе " + getCapital();
    }
}
