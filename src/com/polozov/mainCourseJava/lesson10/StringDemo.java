package com.polozov.mainCourseJava.lesson10;

import java.util.Arrays;
import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2 = "Hello world";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String name = "Ivan";
        String surname = "Ivanov";
        System.out.println(name + " " + surname);
        System.out.println(name + 100);
        System.out.println(100 + 200 + name);

        System.out.println("---------------------------");
        System.out.println(name.length());
        System.out.println(name.charAt(2));
//        System.out.println(name.charAt(10));
        System.out.println(surname.substring(3));
        System.out.println(surname.substring(1, 4));
//        System.out.println(surname.substring(-1, -4));

        System.out.println("---------------------------");

        System.out.println(name.concat(" ").concat(surname));
        System.out.println(String.join("-", name, surname, "Ivanovich"));

        System.out.println("---------------------------");

        // abcdef
        // cde
        // cdr
        System.out.println(surname.indexOf("ano"));
        System.out.println(surname.indexOf("anr"));
        System.out.println(surname.indexOf("o"));
        System.out.println(surname.indexOf("r"));
        System.out.println("ivanovivanov".indexOf("ano"));
        System.out.println("ivanovivanov".lastIndexOf("ano"));

        System.out.println("---------------------------");
        System.out.println("abc".equals("abc"));
        System.out.println("abc".equals("adc"));
        System.out.println("ABC".equalsIgnoreCase("abc"));

        System.out.println("abc".compareTo("abc"));
        System.out.println("abc".compareTo("dbc"));
        System.out.println("tbc".compareTo("abc"));
        System.out.println("tbc".compareTo("agc"));
        System.out.println("Abc".compareTo("abc"));
        System.out.println("abc".compareTo("abcd"));

        System.out.println("---------------------------");

        System.out.println(name.toUpperCase());
        System.out.println("ABC".toLowerCase());

        System.out.println("---------------------------");

        System.out.println("    aaaa  bb ccccc ddd    \n    ".trim());
        System.out.println(name.replace('I', 'a'));
        System.out.println(name.replace("Iv", "Div"));
        System.out.println("ivanov-ivanov".replace("ivanov", "sidorov"));

        System.out.println("---------------------------");

        System.out.println("abc".toCharArray());
        System.out.println(Arrays.toString("aaa bbbbbb cc ddddd eee".split(" ")));

        System.out.println("---------------------------");
        System.out.println(name.isEmpty());
        System.out.println("".isEmpty());
        System.out.println("     ".isEmpty());
        System.out.println("     ".isBlank());
        System.out.println(" \t ".isBlank());
        System.out.println("".isBlank());
        System.out.println(name.isBlank());

        System.out.println("---------------------------");

        System.out.println(surname.startsWith("Iv"));
        System.out.println(surname.startsWith("Ivo"));
        System.out.println(surname.endsWith("Ivo"));
        System.out.println(surname.endsWith("nov"));

        System.out.println(surname.contains("ano"));

        // vanov
        // vano
        System.out.println(surname.regionMatches(1, "TheIvanova", 4, 4));

    }
}
