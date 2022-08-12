package com.polozov.mainCourseJava.lesson08.homework.entity;

import com.polozov.mainCourseJava.lesson08.homework.entity.document.Document;

public class Register {

    private Document[] documents;

    public Register() {
        this.documents = new Document[10];
    }

    public void addDocument(Document document) {
        for (int i = 0; i < this.documents.length; i++) {
            if (this.documents[i] == null) {
                this.documents[i] = document;
                break;
            }
        }
    }

    public void showDocumentInformation(Document document) {
        document.showMainInformation();
    }
}
