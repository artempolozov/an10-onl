package com.polozov.mainCourseJava.lesson06.homework.additionalPart2;

public class ATMApplication {
    public static void main(String[] args) {
        ATMClass atm = new ATMClass(100, 100, 100);
        atm.showCurrentMoney();

        atm.moneyAdding(10, 10, 10);
        atm.showCurrentMoney();

        System.out.println(atm.moneyWithdrawal(5000));
        atm.showCurrentMoney();

        System.out.println(atm.moneyWithdrawal(5000));
        atm.showCurrentMoney();

        System.out.println(atm.moneyWithdrawal(5000));
        atm.showCurrentMoney();

        System.out.println(atm.moneyWithdrawal(3000));
        atm.showCurrentMoney();

        System.out.println(atm.moneyWithdrawal(530));
        atm.showCurrentMoney();


    }
}
