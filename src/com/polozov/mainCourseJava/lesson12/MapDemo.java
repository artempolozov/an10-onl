package com.polozov.mainCourseJava.lesson12;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> newMap = new HashMap<>();
        newMap.put("1111", "Ivanov");
        newMap.put("2222", "Sidorov");
        newMap.put("3333", "Petrov");
        newMap.put("4444", "Belov");

        newMap.put("2222", "Karpov");
        printMap1(newMap);

        System.out.println(newMap.get("2222"));
        System.out.println(newMap.keySet());
        System.out.println(newMap.values());
        System.out.println(newMap.entrySet());
        System.out.println(newMap.getOrDefault("3333", "test-value"));
        System.out.println(newMap.getOrDefault("5555", "test-value"));
        System.out.println(newMap.containsKey("6666"));
        System.out.println(newMap.containsValue("Karpov"));
        newMap.putIfAbsent("2222", "Karpov-2");
        newMap.putIfAbsent("5555", "Karpov-2");
        printMap2(newMap);

        // Задание: подсчитать повторения каждого слова в тексте
        String filename = "text.txt";
        List<String> list = readFile(filename);
        List<String> wordListWithFilterText = getWordListWithFilterText(list);
        Map<String, Integer> stringIntegerMap = calculateWordCount(wordListWithFilterText);
        printMap3(stringIntegerMap);
    }

    public static List<String> readFile(String filename) {
        List<String> lines = new ArrayList<>();
        try (FileReader fr = new FileReader(filename)) {
            Scanner scanner = new Scanner(fr);
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine().replaceAll("[.,]", "").toLowerCase());
            }
        } catch (IOException e) {
            throw new RuntimeException("Не удалось прочитать файл");
        }
        return lines;
    }

    public static List<String> getWordListWithFilterText(List<String> lines) {
        List<String> words = new ArrayList<>();
        for (String line : lines) {
            if (!line.isBlank()) {
                words.addAll(Arrays.asList(line.split(" ")));
            }
        }
        Collections.sort(words);
        return words;
    }

    public static Map<String, Integer> calculateWordCount(List<String> words) {
        Map<String, Integer> wordCountMap = new LinkedHashMap<>();
        for (String word : words) {
            Integer wordCount = wordCountMap.getOrDefault(word, 0);
            wordCountMap.put(word, ++wordCount);
        }
        return wordCountMap;
    }

    public static <K,V> void printMap1(Map<K,V> map) {
        for (Map.Entry<K,V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("-----------------");
    }

    public static <K,V> void printMap2(Map<K,V> map) {
        for (K key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        System.out.println("=====================");
    }

    public static <K,V> void printMap3(Map<K,V> map) {
        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(" - - - - - - - - - - -");

    }
}
