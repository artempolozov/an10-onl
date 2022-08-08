package com.polozov.mainCourseJava.lesson07.addtionalPart;

public class Patient {
    private String name;
    private TreatmentPlan plan;

    public Patient(String name) {
        this.name = name;
        this.plan = new TreatmentPlan();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreatmentPlan getPlan() {
        return plan;
    }

    public void setPlan(TreatmentPlan plan) {
        this.plan = plan;
    }
}
