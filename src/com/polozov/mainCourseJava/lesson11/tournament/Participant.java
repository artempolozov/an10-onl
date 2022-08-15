package com.polozov.mainCourseJava.lesson11.tournament;

import java.util.List;

public class Participant {
    private String name;
    private long id;
    private List<Competition> competitions;

    public Participant(String name, long id, List<Competition> competitions) {
        this.name = name;
        this.id = id;
        this.competitions = competitions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(List<Competition> competitions) {
        this.competitions = competitions;
    }
}
