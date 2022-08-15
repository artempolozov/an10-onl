package com.polozov.mainCourseJava.lesson11.tournament;

import java.util.List;

public class ParticipantGroup {
    private List<Participant> participants;
    private Competition competition;

    public ParticipantGroup(List<Participant> participants, Competition competition) {
        this.participants = participants;
        this.competition = competition;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }
}
