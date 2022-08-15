package com.polozov.mainCourseJava.lesson11.list;

import java.util.ArrayDeque;
import java.util.Stack;

public class StackAndArrayDequeDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("1111");
        stack.push("2222");
        stack.push("3333");
        stack.push("4444");
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

    }
}
