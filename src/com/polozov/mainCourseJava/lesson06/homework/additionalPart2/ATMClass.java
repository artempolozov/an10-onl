package com.polozov.mainCourseJava.lesson06.homework.additionalPart2;

import java.sql.SQLOutput;

public class ATMClass {

    private static final int NOMINAL_1 = 20;
    private static final int NOMINAL_2 = 50;
    private static final int NOMINAL_3 = 100;

    private int countBanknoteWithNominal1;
    private int countBanknoteWithNominal2;
    private int countBanknoteWithNominal3;
    private int currentMoney;

    public ATMClass(int countBanknoteWithNominal1, int countBanknoteWithNominal2, int countBanknoteWithNominal3) {
        this.countBanknoteWithNominal1 = countBanknoteWithNominal1;
        this.countBanknoteWithNominal2 = countBanknoteWithNominal2;
        this.countBanknoteWithNominal3 = countBanknoteWithNominal3;
        this.currentMoney = calculateCurrentSum();
    }

    public void moneyAdding(int countBanknoteWithNominal1,
                            int countBanknoteWithNominal2,
                            int countBanknoteWithNominal3) {
        this.countBanknoteWithNominal1 += countBanknoteWithNominal1;
        this.countBanknoteWithNominal2 += countBanknoteWithNominal2;
        this.countBanknoteWithNominal3 += countBanknoteWithNominal3;
        this.currentMoney = calculateCurrentSum();
    }

    public boolean moneyWithdrawal(int sum) {
        int balance = sum;

        if (this.currentMoney < sum) {
            return false;
        }

        balance = subtractionPossibilitySum(NOMINAL_3, this.countBanknoteWithNominal3, balance);
        int countNominal3 = (sum - balance) / NOMINAL_3;
        sum = balance;

        balance = subtractionPossibilitySum(NOMINAL_2, this.countBanknoteWithNominal2, balance);
        int countNominal2 = (sum - balance) / NOMINAL_2;
        sum = balance;

        balance = subtractionPossibilitySum(NOMINAL_1, this.countBanknoteWithNominal1, balance);
        int countNominal1 = (sum - balance) / NOMINAL_1;
        sum = balance;

        if (sum == 0) {
            this.countBanknoteWithNominal1 -= countNominal1;
            this.countBanknoteWithNominal2 -= countNominal2;
            this.countBanknoteWithNominal3 -= countNominal3;
            showWithdrawalNotification(countNominal1, countNominal2, countNominal3);
            this.currentMoney = calculateCurrentSum();
            return true;
        }
        return false;
    }

    private void showWithdrawalNotification(int countNominal1, int countNominal2, int countNominal3) {
        System.out.printf("Выдано:" +
                "\n\tНоминал: %d\t\tКоличество: %d" +
                "\n\tНоминал: %d\t\tКоличество: %d" +
                "\n\tНоминал: %d\t\tКоличество: %d" +
                "\n---------------------------------------\n",
                NOMINAL_1, countNominal1,
                NOMINAL_2, countNominal2,
                NOMINAL_3, countNominal3);
    }

    private int subtractionPossibilitySum(int nominal, int nominalCount, int sum) {
        int tempCountNominal = sum / nominal;

        if (nominalCount >= tempCountNominal) {
            sum -= tempCountNominal * nominal;
        } else {
            sum -= nominalCount * nominal;
        }
        return sum;
    }

    private int calculateCurrentSum() {
        return NOMINAL_1 * countBanknoteWithNominal1 +
                NOMINAL_2 * countBanknoteWithNominal2 +
                NOMINAL_3 * countBanknoteWithNominal3;
    }

    public void showCurrentMoney() {
        System.out.println("\n----------ТЕКУЩЕЕ СОСТОЯНИЕ---------\n");
        System.out.println("Номинал: " + NOMINAL_1 + "\t\tКоличество: " + this.countBanknoteWithNominal1);
        System.out.println("Номинал: " + NOMINAL_2 + "\t\tКоличество: " + this.countBanknoteWithNominal2);
        System.out.println("Номинал: " + NOMINAL_3 + "\t\tКоличество: " + this.countBanknoteWithNominal3);
        System.out.println("Текущая сумма в банкомате: " + this.currentMoney);
        System.out.println("\n------------------------------------\n");
    }
}
