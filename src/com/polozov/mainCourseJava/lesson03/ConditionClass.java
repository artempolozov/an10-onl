package com.polozov.mainCourseJava.lesson03;

import java.util.Scanner;

public class ConditionClass {
    public static void main(String[] args) {

        boolean hasOranges = true;
        boolean hasWatermelon = false;
        int price = 100;
        int ourMoney = 200;
//
//        System.out.println("Мы подходим к магазину");
//        if (hasOranges && hasWatermelon) {
//            System.out.println("Мы заходим в магазин и покупаем товар");
//        }
//        System.out.println("Мы идем дальше");

        //=-----------------------------------=
//        System.out.println("Мы подходим к магазину");
//        if (hasOranges || hasWatermelon) {
//            System.out.println("Мы заходим в магазин и покупаем товар");
//        } else {
//            System.out.println("Мы ищем киоск с фруктами и идем к нему");
//            System.out.println("Мы покупаме фрукты");
//        }
//        System.out.println("Мы идем дальше");

        // =----------------------------------=
//        System.out.println("Мы подходим к магазину");
//        if (hasOranges || hasWatermelon) {
//            System.out.println("Мы заходим в магазин");
//            if (ourMoney >= price) {
//                System.out.println("Мы покупаем товар");
//            } else {
//                System.out.println("Мы ищем подарочный купон");
//            }
//        } else {
//            System.out.println("Мы ищем киоск с фруктами и идем к нему");
//            System.out.println("Мы покупаме фрукты");
//        }
//        System.out.println("Мы идем дальше");

        int currentHour = 15;
//        if (currentHour < 12) {
//            System.out.println("Утро");
//        } else {
//            if (currentHour >= 12 && currentHour < 18) {
//                System.out.println("День");
//            } else {
//                System.out.println("Вечер");
//            }
//        }

//        if (currentHour < 12) {
//            System.out.println("Утро");
//        } else if (currentHour >= 12 && currentHour < 18) {
//            System.out.println("День");
//        } else if (currentHour >= 18 && currentHour < 23) {
//            System.out.println("Вечер");
//        } else {
//            System.out.println("Ночь");
//        }

//        if (price > 150)
//            System.out.println("Берем");
//        else
//            System.out.println("Не берем");
//
//        // тернарный оператор
//        String result = price > 150 ? "Берем" : "Не берем";
//        System.out.println(result);

        System.out.print("Введите свою оценку: ");
        Scanner scanner = new Scanner(System.in);
        int rate = scanner.nextInt();

        switch (rate) {
            case 0:
                System.out.println("Не посещал");
                break;
            case 1:
                System.out.println("Ужасно");
                break;
            case 2:
                System.out.println("Не сдал");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
            default:
                System.out.println("Неверная оценка");
        }


    }
}
