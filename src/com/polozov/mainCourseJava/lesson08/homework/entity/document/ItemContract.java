package com.polozov.mainCourseJava.lesson08.homework.entity.document;

import com.polozov.mainCourseJava.lesson08.homework.util.ApplicationVariables;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ItemContract extends Document {

    private String itemType;
    private int itemCount;

    public ItemContract(String itemType, int itemCount) {
        this.itemType = itemType;
        this.itemCount = itemCount;
    }

    public ItemContract(int documentNumber, Date documentDate, String itemType, int itemCount) {
        super(documentNumber, documentDate);
        this.itemType = itemType;
        this.itemCount = itemCount;
    }

    @Override
    public String getMainInformation() {
        return String.format("Document number: %d\n" +
                "Item type: %s\n," +
                "Item count: %d\n" +
                "Document date: %s\n",
                getDocumentNumber(),
                getItemType(),
                getItemCount(),
                new SimpleDateFormat(ApplicationVariables.DATE_FORMAT).format(getDocumentDate()));
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
}
