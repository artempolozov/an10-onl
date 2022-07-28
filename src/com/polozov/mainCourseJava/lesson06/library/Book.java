package com.polozov.mainCourseJava.lesson06.library;

public class Book {
    String name;
    int yearOfWriting;
    Author author;
    Genre genre;
    boolean isRead;

    public Book(String name) {
        this.name = name;
        this.isRead = false;
    }

    public Book(String name, int yearOfWriting, Author author, Genre genre) {
        this.name = name;
        this.yearOfWriting = yearOfWriting;
        this.author = author;
        this.genre = genre;
        this.isRead = false;
    }
}
