package com.polozov.mainCourseJava.lesson03;

import java.util.Scanner;

public class HomeWorkNumber3 {
    public static void main(String[] args) {
        /*
         * 3. Для числа t (температура на улице)
         * Если t > 15 , то вывести «Тепло»
         * Если t <= 15 и t > -5 , то вывести «Нормально»
         * Если t <= -5 , то вывести «Холодно»
         */
        int t = new Scanner(System.in).nextInt();
        String state;
        if (t > 15) {
            state = "Тепло";
        } else if (t > -5) {
            state = "Нормально";
        } else {
            state = "Холодно";
        }
        System.out.println(state);
    }
}
