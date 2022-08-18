package com.polozov.mainCourseJava.lesson12.innerClass;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@EqualsAndHashCode
public class House {

    private int cost;
    private String region;
    private String city;
    private Roof roof;
    private Wall wall;

    public House(int cost, String region, String city) {
        this.cost = cost;
        this.region = region;
        this.city = city;
    }

    @Data
    @AllArgsConstructor
    static class Wall {
        private String material;
        private int cost;
    }

    @Data
    @AllArgsConstructor
    static class Roof {
        private String material;
        private int cost;
        private Color color;
    }

    enum Color {
        RED,
        BLACK,
        GREEn,
        BROWN
    }

    public int calculateResultSum() {
//        @Data
//        @AllArgsConstructor
//        class SomeClass {
//            private String someVariable;
//        }
//        SomeClass sc = new SomeClass("ksjdfghk");
        return this.cost + this.roof.cost + this.wall.cost;
    }
}
