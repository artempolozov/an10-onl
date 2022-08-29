package com.polozov.mainCourseJava.lesson15.synchronize;

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Exchanger;

public class NumberGame {
    private List<Player> players;
//    private Set<Player> playersForCurrentRound;
    private static int roundNumber = 1;
    private List<Viewer> viewers;
    private CountDownLatch countDownLatch;
    private Exchanger<String> exchanger;

    public NumberGame(List<Player> players, CountDownLatch countDownLatch, Exchanger<String> exchanger) {
        this.players = players;
        this.countDownLatch = countDownLatch;
        this.exchanger = exchanger;
//        this.playersForCurrentRound = new HashSet<>(2);
        this.viewers = new ArrayList<>();
    }

    public void startGame() throws InterruptedException {
        for (Player p : players) {
            p.start();
        }
        this.countDownLatch.await();
        System.out.println("----------START-----------");
        for (int i = 0; i < this.players.size() - 1; i++) {
//            choosePlayers();
            startCurrentRound();
        }
    }

//    private void choosePlayers() throws InterruptedException {
//        Thread.sleep(500);
//        for (Player p : players) {
//            if (p.isParticipateInCurrentGame()) {
//                addPlayerForCurrentRound(p);
//            }
//        }
//    }

//    private void addPlayerForCurrentRound(Player p) {
//        if (this.playersForCurrentRound.size() < 2) {
//            this.playersForCurrentRound.add(p);
//        }
//    }

    private void startCurrentRound() throws InterruptedException {
        Thread.sleep(500);
        System.out.printf("------ROUND #%d------\n", roundNumber++);
        for (Player p : this.players) {
            p.gameParticipate();
        }
        processResultCurrentRound();
    }

    private void processResultCurrentRound() throws InterruptedException {
//        if (this.playersForCurrentRound.size() == 2) {
//            ArrayList<Player> curPlayers = new ArrayList<>(this.playersForCurrentRound);
//            Player p1 = curPlayers.get(0);
//            Player p2 = curPlayers.get(1);
//            p1.join();
//            p2.join();
//            if (p1.getPlayerValue() > p2.getPlayerValue()) {
//                p2.finishGame();
//                System.out.printf("Победитель - %s\n-------------------\n", p1.getPlayerName());
//                removePlayerFromCurrentRound(p2);
//                p1.addWin();
//            } else if (p1.getPlayerValue() < p2.getPlayerValue()) {
//                p1.finishGame();
//                System.out.printf("Победитель - %s\n-------------------\n", p2.getPlayerName());
//                removePlayerFromCurrentRound(p1);
//                p2.addWin();
//            } else {
//                startCurrentRound();
//            }
//        }

        Player player = this.players.stream()
                .max(Comparator.comparing(Player::getPlayerValue))
                .orElseThrow();
        System.out.printf("Победитель - %s\n-------------------\n", player.getPlayerName());
        player.addWin();
    }

//    private void removePlayerFromCurrentRound(Player p) {
//        this.playersForCurrentRound.remove(p);
//    }

//    public void showResult() {
//        this.players.stream()
//                .sorted(Comparator.comparing(Player::getWins).reversed())
//                .forEach(p -> System.out.println(p.getPlayerName() + " - " + p.getWins()));
//
//    }
    
    public void prepareResult() throws InterruptedException {
        StringBuffer sb = new StringBuffer();
        this.players.stream()
                .sorted(Comparator.comparing(Player::getWins).reversed())
                .forEach(p -> sb.append(p.getPlayerName()).append(" - ").append(p.getWins()).append("\n"));
        String data = exchanger.exchange(sb.toString());
        System.out.println("Получено от ведущего: " + data);
    }

    public void addViewer(Viewer viewer) {
        this.viewers.add(viewer);
        System.out.println("Пришел зритель");
        this.countDownLatch.countDown();
    }
}
