package com.polozov.mainCourseJava.lesson11.tournament;

public class Competition {
    private String name;
    private int rateForReward;

    public Competition(String name, int rateForReward) {
        this.name = name;
        this.rateForReward = rateForReward;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRateForReward() {
        return rateForReward;
    }

    public void setRateForReward(int rateForReward) {
        this.rateForReward = rateForReward;
    }

    public void doAction() {
        System.out.println("Проводится состязание - " + this.name);
    }
}
