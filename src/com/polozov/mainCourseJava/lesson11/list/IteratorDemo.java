package com.polozov.mainCourseJava.lesson11.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(Arrays.asList(
                "aaa", "bbb", "ccc", "ddd", "aaa", "bbb", "ccc", "ddd"));
//        for (String s : list) {
//            if (s.equals("ccc")) {
//                list.remove("ccc");
//            }
//        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("ccc")) {
                list.remove("ccc");
            }
        }
        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("ddd")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
