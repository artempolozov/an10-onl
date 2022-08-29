package com.polozov.mainCourseJava.lesson15.pools;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorServiceDemo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + atomicInteger.getAndIncrement());
            }
        };

        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);

        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000);
                return "Callable: " + Thread.currentThread().getName();
            }
        };

        Future<String> future = executorService.submit(callable);

        Thread tDeamon = new Thread(() -> {
            System.out.println("Отсчет пошел");
            int count = 0;
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(count++);
            }
        });
        tDeamon.setDaemon(true);
        tDeamon.start();

        if (!future.isDone()) {
            System.out.println("Еще не готово!");
        }
        System.out.println(future.get());


        executorService.shutdown();
    }
}
