package com.polozov.mainCourseJava.lesson06.library;

public class Library {
    Book[] books;

    public Library() {
        this.books = new Book[10000];
    }

    public void addBook(Book book) {
        int freeSpaceIndex = findFreeSpace();
        if (freeSpaceIndex > -1) {
            this.books[freeSpaceIndex] = book;
            System.out.println("Книга добавлена: " + book.name);
        } else {
            System.out.println("Библиотека переполнена");
        }
    }

    public void giveBook(Book book) {
        if (book.isRead) {
            System.out.println("Не можем выдать книгу");
        } else {
            System.out.println("Можем выдать " + book.name);
            book.isRead = true;
        }
    }

    public void returnBook(Book book) {
        book.isRead = false;
        System.out.println("Книга " + book.name + " возвращена");
    }

    public int findFreeSpace() {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                return i;
            }
        }
        return -1;
    }

    // TODO: 28.07.2022 РЕАЛИЗОВАТЬ МЕТОД ПОИСК КНИГИ ДЛЯ МЕТОДА giveBook(Book book) 
}
