package com.polozov.mainCourseJava.lesson07.polymorphizm;

public class Belarus extends Country {

    public Belarus(String capital, int population) {
        super(capital, population);
    }

    @Override
    public String getMainInformation() {
        return "Самая красивая страна Беларусь. Со столицей в городе " + getCapital();
    }
}
