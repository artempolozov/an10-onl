package com.polozov.mainCourseJava.lesson03;

import java.util.Scanner;

public class ExampleClass {
    /*
    1.2. Напишите программу, которая будет принимать на вход число (можно задать явно в коде) и на выход
    будет выводить сообщение о четности числа.

    2.4 Напишите программу, которая будет выводить на экран такую последовательность: 7 14 21 28 35 42
    49 56 63 70 77 84 91 98. В решении использовать цикл while

    2.6. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int someNumber = scanner.nextInt();

        System.out.println("Число " + someNumber + " " + (someNumber % 2 == 0 ? "четное" : "нечетное"));
        System.out.printf("Число %d - %s", someNumber, someNumber % 2 == 0 ? "четное" : "нечетное");

        System.out.println("\n-----------------------------------------");

        int num1 = 7;
        while (num1 < 98) {
            System.out.print(num1 + " ");
            num1 += 7;
        }
        System.out.println(num1);

        System.out.println("-----------------------------------------");

        int num2 = 10;
        for (; num2 < 20; num2++) {
            System.out.print(num2 * num2 + " ");
        }
        System.out.println(num2 * num2);
    }
}
