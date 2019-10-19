package com.company;

public class Main {

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.savingsBalance = 2000;
        saver2.savingsBalance = 3000;

        SavingsAccount.modifyInterestRate(0.04);

        saver1.savingsBalance=SavingsAccount.calculateMonthlyInterest(saver1.savingsBalance, SavingsAccount.annualInterestRate);
        saver2.savingsBalance=SavingsAccount.calculateMonthlyInterest(saver2.savingsBalance, SavingsAccount.annualInterestRate);

        System.out.println(saver1.savingsBalance);
        System.out.println(saver2.savingsBalance);

        SavingsAccount.modifyInterestRate(0.05);

        saver1.savingsBalance=SavingsAccount.calculateMonthlyInterest(saver1.savingsBalance, SavingsAccount.annualInterestRate);
        saver2.savingsBalance=SavingsAccount.calculateMonthlyInterest(saver2.savingsBalance, SavingsAccount.annualInterestRate);

        System.out.println(saver1.savingsBalance);
        System.out.println(saver2.savingsBalance);
    }
}

class SavingsAccount {

    public static double calculateMonthlyInterest(double savings, double interest) {
        double total = (savings * interest) / 12;
        return savings + total;
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    static double annualInterestRate = 0.05;
    double savingsBalance;
}