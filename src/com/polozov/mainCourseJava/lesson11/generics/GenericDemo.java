package com.polozov.mainCourseJava.lesson11.generics;

public class GenericDemo {
    public static void main(String[] args) {
        Box box = new Box();

        Fruit orange = new Orange("Brazil");
        Animal dog = new Dog("Jack");

        box.setObject(orange);
        Object object = box.getObject();

        if (object instanceof Animal) {
            ((Animal) object).sound();
        } else if (object instanceof Fruit) {
            System.out.println(((Fruit) object).getCountry());
        }

        GenericBox<Animal> animalBox = new GenericBox<>();
        animalBox.setT(dog);
        animalBox.getT().sound();

        GenericBox<Fruit> fruitBox = new GenericBox<>();
        fruitBox.setT(orange);
        System.out.println(fruitBox.getT().getCountry());

        System.out.println(orange.getClass() == Orange.class);

//        animalBox.setT(orange);

        GenericFruitBox<Fruit> genericFruitBox1 = new GenericFruitBox<>();
        GenericFruitBox<Apple> genericFruitBox2 = new GenericFruitBox<>();

    }
}
