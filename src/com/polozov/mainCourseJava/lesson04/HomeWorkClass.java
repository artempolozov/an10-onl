package com.polozov.mainCourseJava.lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkClass {
    public static void main(String[] args) {
        /*
        Создайте массив целых чисел. Удалите все вхождения заданного числа из массива. Пусть
        число задается с консоли (класс Scanner). Если такого числа нет выведите сообщение
        об этом.
        
        Шахматная доска. Создайте программу для раскраски шахматной доски с помощью
        цикла. Использовать двумерный массив String размером 8х8. С помощью циклов задать
        элементам значения B (Black) или W (White).
         */
        
        int[] arr1 = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int personNumber = scanner.nextInt();
        int newArrayCounter = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 10);
            if (personNumber == arr1[i]) {
                newArrayCounter++;
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(newArrayCounter);

        int[] newArr1 = new int[arr1.length - newArrayCounter];
        for (int i = 0, j = 0; i < arr1.length; i++) {
            if (arr1[i] != personNumber) {
                newArr1[j++] = arr1[i];
            }
        }

        System.out.println(Arrays.toString(newArr1));
        
  
        int size = 8;
        String[][] arr2 = new String[size][size];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.printf("%-5s", "W");
                } else {
                    System.out.printf("%-5s", "B");
                }
            }
            System.out.println();
        }
    }
}
