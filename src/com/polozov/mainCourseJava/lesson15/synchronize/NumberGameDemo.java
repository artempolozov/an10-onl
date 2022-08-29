package com.polozov.mainCourseJava.lesson15.synchronize;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Semaphore;

public class NumberGameDemo {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(2);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(6);
        CountDownLatch countDownLatch = new CountDownLatch(5);
        Exchanger<String> exchanger = new Exchanger<>();
        List<Player> playerList = List.of(
                new Player("Анна", cyclicBarrier),
                new Player("Борис", cyclicBarrier),
                new Player("Владимир", cyclicBarrier),
                new Player("Геннадий", cyclicBarrier),
                new Player("Денис", cyclicBarrier),
                new Player("Евгений", cyclicBarrier),
                new Player("Жозефина", cyclicBarrier)
        );

        NumberGame game = new NumberGame(playerList, countDownLatch, exchanger);
        Presenter presenter = new Presenter(exchanger);
        List<Viewer> viewers = List.of(
                new Viewer(game),
                new Viewer(game),
                new Viewer(game),
                new Viewer(game),
                new Viewer(game)
        );
        game.startGame();
        game.prepareResult();

    }
}
