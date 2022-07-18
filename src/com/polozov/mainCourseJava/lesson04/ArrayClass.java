package com.polozov.mainCourseJava.lesson04;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[]{5, 6, 7, 8, 9};
        int[] arr3 = {1, 2, 3, 4, 5};
//        System.out.println(arr1);
//        System.out.println(arr2);
//        System.out.println(arr3);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * 4;
        }
//        System.out.println(Arrays.toString(arr1));

        int[] arr4 = new int[20];
        // random
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = (int) (Math.random() * 90) + 10;
        }
//        System.out.println(Arrays.toString(arr4));

        int[] arr5 = new int[5];
        arr5[0] = 100;
        arr5[1] = 200;
        arr5[2] = 300;
        arr5[3] = 400;
        arr5[4] = 500;
//        System.out.println(Arrays.toString(arr5));

//        for (int i = 0; i < arr5.length; i++) {
//            System.out.println(arr5[i]);
//        }
//
//        for (int el : arr5) {
//            System.out.println(el);
//        }


        // ARRAYS методы
//        Arrays.toString(arr5);
//        System.out.println(Arrays.binarySearch(arr5, 300));
//        System.out.println(Arrays.binarySearch(arr5, 800));
//        System.out.println(Arrays.compare(new int[]{1, 2, 4}, new int[]{1, 2, 3}));
//        System.out.println(Arrays.compare(new int[]{1, 2, 2}, new int[]{1, 2, 3}));
//        System.out.println(Arrays.compare(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
//        System.out.println(Arrays.compareUnsigned(new int[] {1, 2, -3}, new int[] {1, 2, 3}));

//        int[] arr51 = Arrays.copyOf(arr5, 5);
//        int[] arr52 = Arrays.copyOf(arr5, 10);
//        int[] arr53 = Arrays.copyOf(arr5, 3);
//        System.out.println(Arrays.toString(arr51));
//        System.out.println(Arrays.toString(arr52));
//        System.out.println(Arrays.toString(arr53));

//        int[] arr54 = Arrays.copyOfRange(arr5, 2, 3);
//        int[] arr55 = Arrays.copyOfRange(arr5, 2, 10);
//        System.out.println(Arrays.toString(arr54));
//        System.out.println(Arrays.toString(arr55));


//        System.out.println(new int[] { 1, 2, 3 } == new int[] { 1, 2, 3} );
//        System.out.println(new int[] { 1, 2, 3 }.equals(new int[] { 1, 2, 3}));
//        System.out.println(Arrays.equals(new int[] {1, 2, 3}, new int[] { 1, 2, 3}));

//        int[] arr6 = new int[10];
//        Arrays.fill(arr6, 8);
//        System.out.println(Arrays.toString(arr6));

//        System.out.println(Arrays.mismatch(new int[] {1, 2, 3, 7, 5}, new int[] { 1, 2, 3, 4, 5}));
//        System.out.println(Arrays.mismatch(new int[] {1, 2, 3, 7, 5}, new int[] { 1, 2, 3, 4, 5, 6, 7}));
//        System.out.println(Arrays.mismatch(new int[] {1, 2, 3, 4, 5}, new int[] { 1, 2, 3, 4, 5, 6, 7}));
//        System.out.println(Arrays.hashCode(arr5));

        int[] arr7 = {1, 2, 3, 4};
//        System.out.println(arr7[1]);
//        System.out.println(arr7[10]);
//        for (int i = 0; i <= arr7.length; i++) {
//            System.out.println(arr7[i]);
//        }

//        String[] arr8 = new String[5];
//        System.out.println(Arrays.toString(arr8));
//        System.out.println(arr8[0].getBytes());

//        System.out.println(-3 + Integer.MIN_VALUE);
//        System.out.println(3 + Integer.MIN_VALUE);

//        int[] arr9 = {345, 235, 234, 1, 457, 657};
//        Arrays.sort(arr9);
//        System.out.println(Arrays.toString(arr9));




        // Сортировки
        System.out.println("Сортировка пузырьком");
        int[] array = new int[] {5, 0, 7, 3, 4, 2, 6, 1, 9, 8};
        System.out.println(Arrays.toString(array) + " - исходный массив");
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
            System.out.println(Arrays.toString(array));
        }

        System.out.println("Сортировка вставками");
        array = new int[] {5, 0, 7, 3, 4, 2, 6, 1, 9, 8};
        System.out.println(Arrays.toString(array) + " - исходный массив");
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int j = i - 1;
            while (j >= 0 && currentElement < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentElement;
            System.out.println(Arrays.toString(array) + "\telement = " + currentElement);
        }

        System.out.println("Сортировка выбором");
        array = new int[] {5, 0, 7, 3, 4, 2, 6, 1, 9, 8};
        System.out.println(Arrays.toString(array) + " - исходный массив");
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            int tmp = array[i];
            array[i] = min;
            array[minIndex] = tmp;
            System.out.println(Arrays.toString(array) + "\tmin = " + min);
        }

        int[] array1 = new int[20];
        System.arraycopy(array, 5, array1, 2, 5);
        System.out.println(Arrays.toString(array1));
    }
}
