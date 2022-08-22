package com.polozov.mainCourseJava.lesson13.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        String[] strArray = {"aa", "bbb", "ccc", "dd", "eee"};
        List<String> strings = new ArrayList<>(List.of(strArray));

        // 1
        Stream<String> stream1 = strings.stream();

        // 2
        Stream<String> stream2 = Stream.of(strArray);

        // 3
        Stream<String> stream3 = Arrays.stream(strArray);

        // 4
        try {
            Stream<String> stream4 = Files.lines(Path.of("src/com/polozov/mainCourseJava/lesson13/stream/text.txt"));
            stream4.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException();
        }

        // 5
        IntStream stream5 = "some string".chars();

        // 6
        Stream<Object> stream6 = Stream.builder()
                .add("aaa")
                .add("bbb")
                .add("ccc")
                .add("ddd")
                .build();

        // 7
        Stream<String> stream7 = strings.parallelStream();

        // 8
        Stream<Integer> stream8 = Stream.iterate(0, n -> n + 2);
        System.out.println(stream8.limit(10).count());
        List<Character> chars = Stream.iterate('a', c -> ++c).limit(26).collect(Collectors.toList());
        chars.forEach(System.out::println);

        // 9
        Stream<String> stream9 = Stream.generate(() -> "aaa");
        stream9.limit(5).forEach(System.out::println);
        List<Integer> collect = Stream.generate(() -> (int) (Math.random() * 1000)).limit(1000).collect(Collectors.toList());
        System.out.println(collect.stream().reduce(Integer::sum).get());

    }
}
