package com.polozov.mainCourseJava.lesson14.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThreadDemo2 {
    public static void main(String[] args) {
        List<Long> list = createList(500_000, 500);

        long withoutThreadTime1 = System.nanoTime();
        long withoutThreadMethod1 = sumOfPowForElements(list, 1.5);
        long withoutThreadMethod2 = sumOfPowForElements(list, 0.5);
        long withoutThreadMethod3 = sumOfPowForElements(list, 0.3);
        long withoutThreadTime2 = System.nanoTime();

        AtomicLong withThreadMethod1 = new AtomicLong(); // Long
        AtomicLong withThreadMethod2 = new AtomicLong();
        AtomicLong withThreadMethod3 = new AtomicLong();
        long withThreadTime1 = System.nanoTime();
        new Thread(() -> withThreadMethod1.set(sumOfPowForElements(list, 1.5))).start();
        new Thread(() -> withThreadMethod2.set(sumOfPowForElements(list, 0.5))).start();
        new Thread(() -> withThreadMethod3.set(sumOfPowForElements(list, 0.3))).start();
        long withThreadTime2 = System.nanoTime();

        showResult("Series",
                withoutThreadMethod1,
                withoutThreadMethod2,
                withoutThreadMethod3,
                withoutThreadTime1,
                withoutThreadTime2);

        showResult("Multithreading",
                withThreadMethod1.get(),
                withThreadMethod2.get(),
                withThreadMethod3.get(),
                withThreadTime1,
                withThreadTime2);
    }

    public static List<Long> createList(int size, int bound) {
        return Stream.generate(() -> (int) (Math.random() * bound))
                .limit(size)
                .map(el -> (long) el)
                .collect(Collectors.toList());
    }

    public static long sumOfPowForElements(List<Long> list, double exp) {
        return list.stream()
                .reduce((a, b) -> a + (int) Math.pow(b, exp))
                .orElse(0l);
    }

    public static long createListWithFilling(int size, int bound, double exp) {
        long result = 0L;
        for (int i = 0; i < size; i++) {
            long el = (long) (Math.random() * bound);
            result += (long) Math.pow(el, exp);
        }
        return result;
    }

    public static void showResult(String title, long res1, long res2, long res3, long t1, long t2) {
        System.out.printf("%s\n\tResult-1: %d\n\tResult-2: %d\n\tResult-3: %d\n\tTime: %d ms\n\n",
                title, res1, res2, res3, (t2 - t1));

    }
}
