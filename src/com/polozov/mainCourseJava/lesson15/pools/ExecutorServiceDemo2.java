package com.polozov.mainCourseJava.lesson15.pools;

import com.polozov.mainCourseJava.lesson14.threads.ThreadDemo2;

import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceDemo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Long> longList = ThreadDemo2.createList(10, 500);
        Callable<Long> callable1 = () -> ThreadDemo2.sumOfPowForElements(longList, 1.5);
        Callable<Long> callable2 = () -> ThreadDemo2.sumOfPowForElements(longList, 0.3);
        Callable<Long> callable3 = () -> ThreadDemo2.sumOfPowForElements(longList, 0.2);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Long> future1 = executorService.submit(callable1);
        Future<Long> future2 = executorService.submit(callable2);
        Future<Long> future3 = executorService.submit(callable3);

        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());

        executorService.shutdown();
    }
}
