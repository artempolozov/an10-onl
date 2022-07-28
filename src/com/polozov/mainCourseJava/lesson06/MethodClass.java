package com.polozov.mainCourseJava.lesson06;

import java.util.Arrays;

public class MethodClass {
    public static void main(String[] args) {
        int size = 20;
        int[] arr1 = createArray(size + 5, 100);
        int[] arr2 = createArray(size + 10, 200);
        int[] arr3 = createArray(size + 15, 300);

//        fillArrayByRandomValue(arr1, 100);
//        fillArrayByRandomValue(arr2, 200);
//        fillArrayByRandomValue(arr3, 300);

        printArray(arr1);
        printArray(arr2);
        printArray(arr3);

        System.out.println(findMinValueFromArray(arr1));
        System.out.println(findMinValueFromArray(arr2));
        System.out.println(findMinValueFromArray(arr3));

//        int[] testArr = new int[] { 1, 2, 3 };
//        printArray(testArr);
//        incrementAllValueFromArray(testArr);
//        printArray(testArr);

        printDeepArray(createMultiStageArray(10, 5, 100));

    }

    public static void sum(int a, int b) {
        printNumberInfo(a, 1);
        printNumberInfo(b, 2);
        System.out.println("Сумма чисел - " + (a + b));
    }

    public static int multiplication(int a, int b) {
        return a  * b;
    }

    public static void printNumberInfo(int value, int countValue) {
        System.out.println(countValue + "е число - " + value);
    }

    public static int findMinValueFromArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printDeepArray(int[][] array) {
        System.out.println(Arrays.deepToString(array));
    }

    public static void incrementAllValueFromArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }

    public static void fillArrayByRandomValue(int[] array, int randomValue) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * randomValue);
        }
    }

    public static int[] createArray(int size, int randomValue) {
        int[] array = new int[size];
        fillArrayByRandomValue(array, randomValue);
        return array;
    }

    public static int[][] createMultiStageArray(int sizeX, int sizeY, int randomValue) {
        int[][] array = new int[sizeX][];
        for (int i = 0; i < array.length; i++) {
            array[i] = createArray(sizeY, randomValue);
        }
        return array;
    }


}
