package com.polozov.mainCourseJava.lesson13.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.*;

public class LambdaDemo1 {
    public static void main(String[] args) {
        CalculateOperation sumOperation = (a, b) -> a + b;
        CalculateOperation subOperation = (a, b) -> a - b;
        CalculateOperation multOperation = (a, b) -> a * b;
        CalculateOperation divOperation = (a, b) -> a / b;

        int result1 = sumOperation.calculate(20, 5);
        int result2 = subOperation.calculate(20, 5);
        int result3 = multOperation.calculate(20, 5);
        int result4 = divOperation.calculate(20, 5);

        System.out.println(result1 + " " + result2 + " " + result3 + " " + result4);

        System.out.println("----------Интерфейсы-------------");
        // Predicate
        Person person = new Person(20, "Bill");

        Predicate<Person> isAdult = p -> p.getAge() >= 18;
        System.out.println(isAdult.test(person));

        // Consumer
        Consumer<Person> showName = p -> System.out.println(p.getName());
        showName.accept(person);

        // Function
        Function<Person, String> transformAge = p -> p.getAge() + " years old";
        System.out.println(transformAge.apply(person));

        // Supplier
//        Supplier<Person> personCreator = () -> {
//            System.out.print("Enter name: ");
//            String name = new Scanner(System.in).nextLine();
//            int age = (int) (Math.random() * 100);
//            return new Person(age, name);
//        };
//        System.out.println(personCreator.get());

        // UnaryOperator
        UnaryOperator<Person> incrementAge = p -> {
            p.setAge(p.getAge() + 1);
            return p;
        };
        System.out.println(incrementAge.apply(person));

        // BinaryOperator
        Person person2 = new Person(40, "Kevin");
        BinaryOperator<Person> whoOlder = (p1, p2) -> {
            if (p1.getAge() >= p2.getAge()) {
                return p1;
            }
            return p2;
        };
        System.out.println(whoOlder.apply(person, person2));

        // Использование лямбд
        // задача: отсортировать строковые элементы списка по длине
        List<String> strings1 = new ArrayList<>(List.of("dfkjsg", "jfdhkfdh", "sdfg", "fg", "kdjfghkshgf", "gbgh"));
        List<String> strings2 = new ArrayList<>(List.of("dfkjsg", "jfdhkfdh", "sdfg", "fg", "kdjfghkshgf", "gbgh"));

        // old style
        strings1.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        // new style
        strings2.sort((o1, o2) -> o1.length() - o2.length());

        System.out.println(strings1);
        System.out.println(strings2);
    }
}
