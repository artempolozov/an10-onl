package com.polozov.mainCourseJava.lesson15.synchronize;

public class Viewer extends Thread {
    private NumberGame game;

    public Viewer(NumberGame game) {
        this.game = game;
        this.start();
    }

    @Override
    public void run() {
        game.addViewer(this);
    }
}
