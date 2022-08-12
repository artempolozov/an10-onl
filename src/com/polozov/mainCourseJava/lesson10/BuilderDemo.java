package com.polozov.mainCourseJava.lesson10;

public class BuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ignat");
        System.out.println(sb);
        System.out.println(sb.charAt(3));
        sb.setCharAt(0, 'I');
        System.out.println(sb);
        sb.setLength(3);
        System.out.println(sb);
        sb.setLength(10);
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder(5);
        System.out.println(sb2.append("test-line").append(5).append(5.3f));
        System.out.println(sb2);
        sb2.reverse();
        System.out.println(sb2);
        sb2.delete(0, 4);
        System.out.println(sb2);
        sb2.deleteCharAt(4);
        System.out.println(sb2);
    }
}
