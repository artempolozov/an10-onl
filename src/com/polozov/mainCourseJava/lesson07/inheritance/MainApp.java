package com.polozov.mainCourseJava.lesson07.inheritance;

public class MainApp {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("марка",
                "модель",
                1900,
                "черный",
                "v6",
                1000000,
                "электро");

        Bike b1 = new Bike();
        Bike b2 = new Bike("марка",
                "модель",
                1900,
                "черный",
                "v6",
                1000000,
                "электро",
                3);

        System.out.println(b2.color);
        b2.move();
        b2.stop();
        b2.championship();

        Vehicle v3 = new Bike();
        v3.move();

//        Bike b3 = new Vehicle();


        Car car = new Car();
        car.someMethod2(1);
        Car.someMethod1(10);


        System.out.println(Car.STATIC_FINAL_PROPERTY);
    }
}
