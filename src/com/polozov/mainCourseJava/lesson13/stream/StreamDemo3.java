package com.polozov.mainCourseJava.lesson13.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        List<String> stringList =
                Stream.of("aaaaa", "bbbbbb", "cccccc", "dddd", "eeee", "aaaaa", "bbbbbb", "cccccc")
                        .collect(Collectors.toList());

        // Конвейерные операции
        // filter
        // skip
        // limit
        String result = stringList.stream()
                .filter(s -> s.length() > 4)
//                .limit(4)
                .peek(s -> {
                    System.out.println("element - " + s);
                })
                .findAny()
                .orElse("none");
        System.out.println(result);

        // map
        // distinct
        // forEach
        stringList.stream()
                .map(s -> s.length())
                .distinct()
                .forEach(n -> {
                    System.out.println(n);
                    System.out.println(n);
                });

        // sorted
        stringList.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        // flatMap
        stringList.stream()
                .flatMap(s -> Arrays.asList(s.split("")).stream())
                .forEach(System.out::print);

        System.out.println(stringList.stream()
                .anyMatch("bbbb"::equals));
        System.out.println(stringList.stream()
                .noneMatch("abc"::equals));
        System.out.println(stringList.stream()
                .allMatch("bbbb"::equals));
    }
}
