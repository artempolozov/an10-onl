package com.polozov.mainCourseJava.lesson09;

import javax.print.DocFlavor;
import java.io.FileNotFoundException;

public class ExceptionDemo2 {
    public static void main(String[] args) {
//        tryMethod1(40, 5);
        tryMethod1(3, 0);

////        tryMethod3(new String[] {"1", "2", "3"});
////        tryMethod3(new String[] {"1", "2"});
////        tryMethod3(new String[] {"1", "2", "xfagklnjh"});
//
//        tryMethod4();
    }

    public static void tryMethod1(int a, int b) {
        System.out.println("START");
        try {
            System.out.println(a / b);
            System.exit(0);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка перехвачена");
        } finally {
            System.out.println("БЛОК FINALLY");
        }
        System.out.println("END");
    }

    public static void tryMethod2(String[] array) {
        System.out.println("START");
        try {
            int num1 = Integer.parseInt(array[0]);
            int num2 = Integer.parseInt(array[1]);
            int num3 = Integer.parseInt(array[2]);
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        } catch (NumberFormatException e) {
            System.out.println("Невозможно привести строку к числу");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вышли за границу массива по индексу");
        } catch (Exception e) {
            System.out.println("КАКАЯ-ТО ОШИБКА");
        }
        System.out.println("END\n");
    }

    public static void tryMethod3(String[] array) {
        System.out.println("START");
        try {
            int num1 = Integer.parseInt(array[0]);
            int num2 = Integer.parseInt(array[1]);
            int num3 = Integer.parseInt(array[2]);
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Какая-то ошибка");
        }
        System.out.println("END\n");
    }

    public static void tryMethod4() {
        System.out.println("START");
        try {
            System.out.println("start try-1");
            try {
                System.out.println("start try-2");
                try {
                    System.out.println("start try-3");
                    int[] array = {1, 2, 3};
                    System.out.println(array[4]);
                    System.out.println("end try-3");
                } catch (Throwable t) {
                    t.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("END");
    }
}
