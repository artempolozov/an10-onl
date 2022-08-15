package com.polozov.mainCourseJava.lesson11.tournament;

public class TournamentArea {
    private ParticipantGroup group;
    private Referee referee;

    public void startCompetition() {
        this.group.getCompetition().doAction();
        System.out.println("Проходит время...");

    }
}
