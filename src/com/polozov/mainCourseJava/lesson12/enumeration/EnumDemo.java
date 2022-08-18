package com.polozov.mainCourseJava.lesson12.enumeration;

public class EnumDemo {
    public static void main(String[] args) {
        Month month = Month.AUGUST;
        Schedule schedule = new Schedule(1L, month);
        month.setInRus("А! ВГУ! АВГУСТ!");
        System.out.println(schedule.getMonth());
        System.out.println(schedule.getMonth().getInRus());
    }
}
