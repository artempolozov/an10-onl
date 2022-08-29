package com.polozov.mainCourseJava.lesson15.synchronize;

import java.util.concurrent.Exchanger;

public class Presenter extends Thread {
    private String result;
    private Exchanger<String> exchanger;

    public Presenter(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        this.start();
    }

    @Override
    public void run() {
        try {
            this.result = exchanger.exchange("test");
            System.out.println(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
