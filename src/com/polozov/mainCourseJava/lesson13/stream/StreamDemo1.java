package com.polozov.mainCourseJava.lesson13.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            numbers.add((int) (Math.random() * 200));
        }

        long ot1 = System.nanoTime();
        int sum1 = 0;
        for (int el : numbers) {
            if (el > 100 && el % 2 == 0) {
                sum1 += el;
            }
        }
        long ot2 = System.nanoTime();

        long nt1 = System.nanoTime();
        Integer sum2 = numbers.stream()
                .filter(n -> n > 100 && n % 2 == 0)
                .reduce(Integer::sum)
                .orElse(0);
        long nt2 = System.nanoTime();

        System.out.println(sum1 + " найдено за " + (ot2 - ot1) + " мс");
        System.out.println(sum2 + " найдено за " + (nt2 - nt1) + " мс");
    }
}
