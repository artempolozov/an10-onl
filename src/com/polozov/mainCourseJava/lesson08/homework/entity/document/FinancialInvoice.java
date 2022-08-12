package com.polozov.mainCourseJava.lesson08.homework.entity.document;

import com.polozov.mainCourseJava.lesson08.homework.util.ApplicationVariables;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FinancialInvoice extends Document {

    private int monthlyTotal;
    private String departmentCode;

    public FinancialInvoice(int monthlyTotal, String departmentCode) {
        this.monthlyTotal = monthlyTotal;
        this.departmentCode = departmentCode;
    }

    public FinancialInvoice(int documentNumber, Date documentDate, int monthlyTotal, String departmentCode) {
        super(documentNumber, documentDate);
        this.monthlyTotal = monthlyTotal;
        this.departmentCode = departmentCode;
    }

    @Override
    public String getMainInformation() {
        return String.format("Document number: %d\n" +
                "Document date: %s\n" +
                "Monthly total: %d\n" +
                "Department code: %s\n",
                getDocumentNumber(),
                new SimpleDateFormat(ApplicationVariables.DATE_FORMAT).format(getDocumentDate()),
                getMonthlyTotal(),
                getDepartmentCode());
    }

    public int getMonthlyTotal() {
        return monthlyTotal;
    }

    public void setMonthlyTotal(int monthlyTotal) {
        this.monthlyTotal = monthlyTotal;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
}
