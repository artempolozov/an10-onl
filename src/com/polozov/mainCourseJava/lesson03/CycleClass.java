package com.polozov.mainCourseJava.lesson03;

public class CycleClass {
    public static void main(String[] args) {

//        int count = 10;

//        while (count <= 10) {
//            System.out.println(count++);
//        }

//        do {
//            System.out.println(count++);
//        } while (count < 8);

//        while (true) {
//            System.out.println(count++);
//            if (count == 50) {
//                break;
//            }
//        }

//        for (int i = 0, j = 10; i < 20 && j > 5; i++, j--) {
//            System.out.println("i = " + i + "\tj = " + j);
//        }

//        int a = 10;
//        for (;;) {
//            System.out.println(++a);
//            if (a == 50) {
//                break;
//            }
//        }

        char e = 'a';
        for ( int i = 0; i < 26; i++, e++) {

//            if (i >= 5 && i < 10) {
//                System.out.print(e + " ");
//            }

            if (i % 2 == 0) {
                continue;
            }
            System.out.print(e + " ");
        }
    }
}
