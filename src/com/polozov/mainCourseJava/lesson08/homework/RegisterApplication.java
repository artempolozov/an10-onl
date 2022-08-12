package com.polozov.mainCourseJava.lesson08.homework;

import com.polozov.mainCourseJava.lesson08.homework.entity.Register;
import com.polozov.mainCourseJava.lesson08.homework.entity.document.Document;
import com.polozov.mainCourseJava.lesson08.homework.entity.document.EmployeeContract;
import com.polozov.mainCourseJava.lesson08.homework.entity.document.FinancialInvoice;
import com.polozov.mainCourseJava.lesson08.homework.entity.document.ItemContract;

import java.util.Date;

public class RegisterApplication {
    public static void main(String[] args) {
        Register register = new Register();

        Document document1 = new EmployeeContract(
                1,
                new Date(),
                new Date(System.currentTimeMillis() - 10000000000L),
                new Date(System.currentTimeMillis() + 10000000000L),
                "name-1");

        Document document2 = new EmployeeContract(
                2,
                new Date(),
                new Date(System.currentTimeMillis() - 20000000000L),
                new Date(System.currentTimeMillis() + 20000000000L),
                "name-2");

        Document document3 = new ItemContract(3, new Date(),"type-1", 100);
        Document document4 = new ItemContract(4, new Date(),"type-2", 200);
        Document document5 = new ItemContract(5, new Date(),"type-3", 300);

        Document document6 = new FinancialInvoice(6, new Date(), 555000, "code-1");
        Document document7 = new FinancialInvoice(7, new Date(), 500000, "code-2");
        Document document8 = new FinancialInvoice(8, new Date(), 700000, "code-1");

        register.addDocument(document1);
        register.addDocument(document2);
        register.addDocument(document3);
        register.addDocument(document4);
        register.addDocument(document5);
        register.addDocument(document6);
        register.addDocument(document7);
        register.addDocument(document8);

        register.showDocumentInformation(document1);
        register.showDocumentInformation(document2);
        register.showDocumentInformation(document3);
        register.showDocumentInformation(document4);
        register.showDocumentInformation(document5);
        register.showDocumentInformation(document6);
        register.showDocumentInformation(document7);
        register.showDocumentInformation(document8);
    }
}
