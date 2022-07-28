package com.polozov.mainCourseJava.lesson06;

import com.polozov.mainCourseJava.lesson06.library.Author;
import com.polozov.mainCourseJava.lesson06.library.Book;
import com.polozov.mainCourseJava.lesson06.library.Genre;
import com.polozov.mainCourseJava.lesson06.library.Library;

public class MainLesson06Class {
    public static void main(String[] args) {
        User user1 = new User();
//
////        System.out.println(user1.id);
//        user1.id = 1L;
//        user1.username = "John";
////        System.out.println(user1.id + " - " + user1.username + " - " + user1.password);
//
//
        User user2 = new User(2L, "big-boss", "qwerty");
        User user3 = new User(2L, "big-boss", "qwerty");
//        Cat cat1 = new Cat();
//        Cat cat2 = new Cat("Barsik", 5, "english", "red");
//        Cat cat3 = new Cat("Vasiliy", 15, "-", "black", true);
//
//
//        cat1.play();
//        cat1.eat("кошачий корм");
//        String someLiquidFood = "молоко";
//        cat1.eat(someLiquidFood);
//        cat1.sleep();

//        someMethod(1, new int[] { 1, 2, 3, 4, 5, 1, 2, 3});
//        someMethod(3, new int[] { 1, 2, 3, 4, 5, 1, 2, 3});
//        someMethod(6, new int[] { 1, 2, 3, 4, 5, 1, 2, 3});
//        someMethod(0, new int[] { 1, 2, 3, 4, 5, 1, 2, 3});

        /*
        1. Создать класс Person, который содержит:

    переменные fullName, age;
    методы move() и talk(), в которых просто вывести на консоль сообщение
    -"Такой-то  Person говорит".
    Добавьте два конструктора  - Person() и Person(fullName, age).
    Создайте два объекта этого класса. Один объект инициализируется
    конструктором Person(), другой - Person(fullName, age).
         */

//        Person person1 = new Person();
//        Person person2 = new Person("Иванов Иван Иванович", 20);
//
//        Author author = new Author("Пушкин");
//        Genre genre = new Genre("Романтика");
//        Book book1 = new Book("Стихи", 1820, author, genre);
//        Book book2 = new Book("Евгений Онегин", 1821, author, genre);
//        Book book3 = new Book("Руслан и Людмила", 1822, author, genre);
//        Library library = new Library();
//        library.addBook(book1);
//        library.addBook(book2);
//        library.addBook(book3);
//
//        library.giveBook(book1);
//        library.giveBook(book2);
//
//        library.returnBook(book1);


        System.out.println(user1.hashCode());
        System.out.println(user1.getClass());
        System.out.println(user1);
        System.out.println(user1.equals(user2));
        System.out.println(user3.equals(user2));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());

    }

    public static boolean someMethod(int num, int[] array) {
        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }
}
