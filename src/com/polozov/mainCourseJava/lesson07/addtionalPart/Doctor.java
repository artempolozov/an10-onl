package com.polozov.mainCourseJava.lesson07.addtionalPart;

public abstract class Doctor {
    protected String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public abstract void treating();
}
