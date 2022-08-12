package com.polozov.mainCourseJava.lesson08.homework.entity.document;

import java.util.Date;

public abstract class Document implements Printable{

    private int documentNumber;
    private Date documentDate;

    public Document() {
    }

    public Document(int documentNumber, Date documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }

    public abstract String getMainInformation();

    public void showMainInformation() {
        System.out.println(getMainInformation());
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }
}
