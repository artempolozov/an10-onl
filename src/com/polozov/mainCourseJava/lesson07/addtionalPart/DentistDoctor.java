package com.polozov.mainCourseJava.lesson07.addtionalPart;

public class DentistDoctor extends Doctor {

    public DentistDoctor() {
        this.specialization = "Дантист";
    }

    @Override
    public void treating() {
        System.out.printf("%s лечит зубы", this.specialization);
    }
}
