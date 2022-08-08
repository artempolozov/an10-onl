package com.polozov.mainCourseJava.lesson07.addtionalPart;

public class PatientCard {
    private Patient patient;
    private Doctor doctor;

    public PatientCard(Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
