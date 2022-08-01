package com.polozov.mainCourseJava.lesson07.modoficators;

public class Computer extends Technic {

    public String brand;
    private String chipset;

    public Computer(String brand, String chipset) {
        this.brand = brand;
        this.chipset = chipset;
    }

    public Computer(int power, int price, String country, String charging, String brand, String chipset) {
        super(power, price, country, charging);
        this.brand = brand;
        this.chipset = chipset;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }
}
