package com.polozov.mainCourseJava.lesson05;

import java.util.Arrays;
import java.util.Scanner;

public class MyArrayClass {
    public static void main(String[] args) {
        //ОБЪЯВЛЕНИЕ
        int[][] arr1 = new int[3][5];
        int[][] arr2 = new int[4][];
        int[][] arr3 = {{1, 2}, {3, 4, 5}};
        int[][] arr4 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));
        System.out.println(Arrays.deepToString(arr3));
        System.out.println(Arrays.deepToString(arr4));

        // ИНИЦИАЛИЗАЦИЯ
        // ручная

        int[][] arr5 = new int[2][3];
        arr5[0][0] = -1;
        arr5[0][1] = 2;
        arr5[0][2] = -3;
        arr5[1][0] = 4;
        arr5[1][1] = -5;
        arr5[1][2] = 6;
        System.out.println(Arrays.deepToString(arr5));

        // циклы
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = (int) (Math.random() * 100);
            }
        }

        // инициализация непрямоугольного массива
        arr2[0] = new int[4];
        arr2[1] = new int[3];
        arr2[2] = new int[5];
        arr2[3] = new int[2];

        // итерирование
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.println(arr4[i][j]);
            }
        }

        for (int[] outerArray : arr5) {
            for (int innerElement : outerArray) {
                System.out.println(innerElement);
            }
        }

        int[][][] arr6 = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        for (int i = 0; i < arr6.length; i++) {
            for (int j = 0; j < arr6[i].length; j++) {
                for (int k = 0; k < arr6[i][j].length; k++) {
                    System.out.println(arr6[i][j][k]);
                }
            }
        }

        /*
        Создайте массив размерностью 5 на 6 и заполните его случайными числами (в диапазоне от 0 до 99 ).
          Выведите на консоль третью строку
         */
        System.out.println("Task #1");
        int[][] arrTask1 = new int[5][6];
        for (int i = 0; i < arrTask1.length; i++) {
            for (int j = 0; j < arrTask1[i].length; j++) {
                arrTask1[i][j] = (int) (Math.random() * 100) - 50;
            }
        }
        System.out.println(Arrays.toString(arrTask1[2]));

        /*
        Даны матрицы С и D размерностью 3 на 3 и заполненные случайными числами в диапазоне  от 10 до 49.
        Выполните сложение, потом вычитание матриц друг на друга.
        Выведете исходные матрицы и результат вычислений на консоль.
         */
        System.out.println("----------------------------------------------");
        System.out.println("Task #2");
        int[][] arrA = new int[][]{
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int sizeX = 3;
        int sizeY = 3;
        int[][] arrC = new int[sizeX][sizeY];
        int[][] arrD = new int[sizeX][sizeY];
        int[][] arrSumCD = new int[3][3];
        int[][] arrSubtractionCD = new int[3][3];

        for (int i = 0; i < arrC.length; i++) {
            for (int j = 0; j < arrC[i].length; j++) {
                arrC[i][j] = (int) (Math.random() * 20) + 30;
                arrD[i][j] = (int) (Math.random() * 10) + 10;

                arrSumCD[i][j] = arrC[i][j] + arrD[i][j];
                arrSubtractionCD[i][j] = arrC[i][j] - arrD[i][j];
            }
        }

        for (int i = 0; i < arrSumCD.length; i++) {
            System.out.print("|");
            for (int j = 0; j < arrSumCD[i].length; j++) {
                System.out.printf("%4d ", arrSumCD[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("----------------------------------------------");

        for (int i = 0; i < arrSumCD.length; i++) {
            System.out.printf("%-15s%s%15s  %s%15s\n",
                    Arrays.toString(arrC[i]),
                    i == 1 ? "+" : " ",
                    Arrays.toString(arrD[i]),
                    i == 1 ? "=" : " ",
                    Arrays.toString(arrSumCD[i])
            );
        }

        System.out.println("----------------------------------------------");

        for (int i = 0; i < arrSumCD.length; i++) {
            System.out.printf("%-15s%s%15s  %s%15s\n",
                    Arrays.toString(arrC[i]),
                    i == 1 ? "-" : " ",
                    Arrays.toString(arrD[i]),
                    i == 1 ? "=" : " ",
                    Arrays.toString(arrSubtractionCD[i])
            );

        }

        System.out.println("----------------------------------------------");
    }
}
