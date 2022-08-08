package com.polozov.mainCourseJava.lesson07.addtionalPart;

public class SurgeonDoctor extends Doctor {
    public SurgeonDoctor() {
        this.specialization = "Хирург";
    }

    @Override
    public void treating() {
        System.out.printf("%s проводит операцию", this.specialization);
    }
}
