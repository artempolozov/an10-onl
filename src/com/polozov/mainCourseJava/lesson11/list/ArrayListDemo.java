package com.polozov.mainCourseJava.lesson11.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third");
        System.out.println(arrayList);

        arrayList.add(1, "hello");
        System.out.println(arrayList);

//        arrayList.add(5, "fourth");
//        System.out.println(arrayList);

        arrayList.set(1, "first-hello");
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);

        arrayList.remove("third");
        System.out.println(arrayList);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        System.out.println(integerList);
        integerList.remove(Integer.valueOf(4));
        System.out.println(integerList);

        integerList.remove(Integer.valueOf(10));

        System.out.println(arrayList.contains("first"));
        String[] strings = arrayList.toArray(new String[0]);
        System.out.println(Arrays.toString(strings));


        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.ensureCapacity(20);
        arrayList1.trimToSize();
    }
}
