package com.polozov.mainCourseJava.lesson09;

import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {

    }

    public static void exception1() {
        int a = 5;
        int b = 0;
        System.out.println(a / b);
    }

    public static void exception2(int count) {
        System.out.println(count++);
        exception2(count);
    }

    public static void exception3() {
        int[] arr = new int[] {1, 2, 3};
        System.out.println(arr[5]);
    }

    public static void exception4() {
        System.out.print("Введите число: ");
        String value = new Scanner(System.in).nextLine();
        int number = Integer.parseInt(value);
        System.out.println("Ваше число: " + number);
    }
}
