package com.polozov.mainCourseJava.lesson12.enumeration;

public class Schedule {
    private long id;
    private Month month;

    public Schedule(long id, Month month) {
        this.id = id;
        this.month = month;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }
}
