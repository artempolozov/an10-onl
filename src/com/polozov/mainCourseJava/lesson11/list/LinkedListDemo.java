package com.polozov.mainCourseJava.lesson11.list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("first");
        list.add("second");
        list.add("third");

        System.out.println(list);

        System.out.println(list.getFirst());

        list.addFirst("1");
        list.offerFirst("2");
        System.out.println(list);

        list.addLast("4");
        list.offerLast("5");
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.peekFirst());
        System.out.println(list);

        System.out.println(list.removeFirst());
        System.out.println(list.pollLast());
        System.out.println(list);
    }
}
