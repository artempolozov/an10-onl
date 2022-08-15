package com.polozov.mainCourseJava.lesson11.tournament;

public class CompetitionResult {
    private ParticipantGroup group;
    private int result;
    private String reward;

    public CompetitionResult(ParticipantGroup group) {
        this.group = group;
        this.result = 0;
        this.reward = "Золотые шоколадные медальки";
    }

    public ParticipantGroup getGroup() {
        return group;
    }

    public void setGroup(ParticipantGroup group) {
        this.group = group;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public void calculateResult() {
        int bearer = this.group.getCompetition().getRateForReward();
        setResult((int) (Math.random() * 100));
        if (getResult() >= bearer) {

        }
    }
}
