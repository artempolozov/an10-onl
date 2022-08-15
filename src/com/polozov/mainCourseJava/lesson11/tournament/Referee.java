package com.polozov.mainCourseJava.lesson11.tournament;

public class Referee {
    private String name;
    private CompetitionResult result;

    public Referee(String name, CompetitionResult result) {
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompetitionResult getResult() {
        return result;
    }

    public void setResult(CompetitionResult result) {
        this.result = result;
    }
}
