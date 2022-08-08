package com.polozov.mainCourseJava.lesson07.addtionalPart;

public class TherapistDoctor extends Doctor {

    public TherapistDoctor() {
        this.specialization = "Терапевт";
    }

    @Override
    public void treating() {
        System.out.printf("%s проводит общий осмотр", this.specialization);
    }
}
