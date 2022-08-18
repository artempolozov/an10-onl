package com.polozov.mainCourseJava.lesson12;

import com.polozov.mainCourseJava.lesson08.Printable;

public class Drawer {
    private String name;
    private Printable printable;

    public Drawer(String name, Printable printable) {
        this.name = name;
        this.printable = printable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Printable getPrintable() {
        return printable;
    }

    public void setPrintable(Printable printable) {
        this.printable = printable;
    }
}
