package com.polozov.mainCourseJava.lesson07.modoficators;

public class Technic {

    private int power;
    private int price;
    private String country;
    private String charging;

    public Technic() {
    }

    public Technic(int power, int price, String country, String charging) {
        this.power = power;
        this.price = price;
        this.country = country;
        this.charging = charging;
    }

    public int getPower() {
        return power;
    }

    public int getPrice() {
        return price;
    }

    public String getCountry() {
        return country;
    }

    public String getCharging() {
        return charging;
    }

    public void showProperties() {
        System.out.println(groupMainProperty());
    }

    private String groupMainProperty() {
        return "power: " + power + "\tprice: " + price;
    }
}
