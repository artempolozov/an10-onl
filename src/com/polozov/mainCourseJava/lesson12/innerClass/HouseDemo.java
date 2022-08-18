package com.polozov.mainCourseJava.lesson12.innerClass;

public class HouseDemo {
    public static void main(String[] args) {
        House house = new House(100_000, "region-1", "city-1");

        house.setWall(new House.Wall("material-1", 5_000));
        house.setRoof(new House.Roof("material-2", 50_000, House.Color.BROWN));

        System.out.println(house.calculateResultSum());
    }
}
