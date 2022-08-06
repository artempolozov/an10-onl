package com.polozov.mainCourseJava.lesson08;

public class TShortClass {
    private String size;
    private String color;
    private Printable picture;

    public TShortClass(String size, String color, Printable picture) {
        this.size = size;
        this.color = color;
        this.picture = picture;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Printable getPicture() {
        return picture;
    }

    public void setPicture(Printable picture) {
        this.picture = picture;
    }

    public void presentTShort() {
        System.out.print("TShort\tsize: " + size + "\twith picture: ");
        picture.print();
    }
}
