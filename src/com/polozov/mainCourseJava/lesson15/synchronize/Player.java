package com.polozov.mainCourseJava.lesson15.synchronize;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Player extends Thread {
    private String playerName;
    private CyclicBarrier cyclicBarrier;
    private Semaphore semaphore;
    private int wins;
    private boolean participateInCurrentGame;
    private int playerValue;

    public Player(String playerName, CyclicBarrier cyclicBarrier/*, Semaphore semaphore*/) {
        this.playerName = playerName;
        this.cyclicBarrier = cyclicBarrier;
/*        this.semaphore = semaphore;*/
        this.wins = 0;
        this.participateInCurrentGame = false;
    }

    @Override
    public void run() {
        System.out.printf("Участник %s готов к участию...\n", this.playerName);
        try {
            cyclicBarrier.await();
//            semaphore.acquire();
            this.participateInCurrentGame = true;
            System.out.printf("Участник %s принимает участие в текущем раунде...\n", this.playerName);
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public CyclicBarrier getCyclicBarrier() {
        return cyclicBarrier;
    }

    public void setCyclicBarrier(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public boolean isParticipateInCurrentGame() {
        return participateInCurrentGame;
    }

    public void setParticipateInCurrentGame(boolean participateInCurrentGame) {
        this.participateInCurrentGame = participateInCurrentGame;
    }

    public int getPlayerValue() {
        return playerValue;
    }

    private void generateNumber() {
        this.playerValue = (int) (Math.random() * 1000);
    }

    public void gameParticipate() {
        System.out.printf("Участник %s генерирует число...\n", this.playerName);
        generateNumber(); // генерируем значение игрока
        System.out.printf("Число участника %s - %d\n", this.playerName, getPlayerValue());
    }

//    public void finishGame() {
//        semaphore.release();
//        this.participateInCurrentGame = false;
//        System.out.printf("Участник %s покидает игру\n", this.playerName);
//    }

    public void addWin() {
        this.wins++;
    }
}
