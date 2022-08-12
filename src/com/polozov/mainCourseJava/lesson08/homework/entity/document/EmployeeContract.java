package com.polozov.mainCourseJava.lesson08.homework.entity.document;

import com.polozov.mainCourseJava.lesson08.homework.util.ApplicationVariables;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeContract extends Document {

    private Date startContractDate;
    private Date endContractDate;
    private String employeeName;

    public EmployeeContract(Date startContractDate, Date endContractDate, String employeeName) {
        this.startContractDate = startContractDate;
        this.endContractDate = endContractDate;
        this.employeeName = employeeName;
    }

    public EmployeeContract(int documentNumber, Date documentDate, Date startContractDate, Date endContractDate, String employeeName) {
        super(documentNumber, documentDate);
        this.startContractDate = startContractDate;
        this.endContractDate = endContractDate;
        this.employeeName = employeeName;
    }

    @Override
    public String getMainInformation() {
        return String.format("Document number: %d\n" +
                "Document date: %s\n" +
                "Start contract date: %s\n" +
                "End contract date: %s\n" +
                "Employee name: %s\n",
                getDocumentNumber(),
                new SimpleDateFormat(ApplicationVariables.DATE_FORMAT).format(getDocumentDate()),
                new SimpleDateFormat(ApplicationVariables.DATE_FORMAT).format(getStartContractDate()),
                new SimpleDateFormat(ApplicationVariables.DATE_FORMAT).format(getEndContractDate()),
                getEmployeeName()
                );
    }

    public Date getStartContractDate() {
        return startContractDate;
    }

    public void setStartContractDate(Date startContractDate) {
        this.startContractDate = startContractDate;
    }

    public Date getEndContractDate() {
        return endContractDate;
    }

    public void setEndContractDate(Date endContractDate) {
        this.endContractDate = endContractDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
