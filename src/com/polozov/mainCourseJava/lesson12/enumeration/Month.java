package com.polozov.mainCourseJava.lesson12.enumeration;

public enum Month {
    JANUARY ("Январь"),
    FEBRUARY ("Февраль"),
    MARCH ("Март"),
    APRIL ("Апрель"),
    MAY ("Май"),
    JUNE ("Июнь"),
    JULY ("Июль"),
    AUGUST ("Август"),
    SEPTEMBER ("Сентябрь"),
    OCTOBER ("Октябрь"),
    NOVEMBER ("Ноябрь"),
    DECEMBER ("Декабрь");

    private String inRus;

    Month(String inRus) {
        this.inRus = inRus;
    }

    public String getInRus() {
        return inRus;
    }

    public void setInRus(String inRus) {
        this.inRus = inRus;
    }
}
