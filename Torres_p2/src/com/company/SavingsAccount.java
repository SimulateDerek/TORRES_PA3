package com.company;

public class SavingsAccount {

    static double annualInterestRate = 0.05;

    public static void modifyInterestRate(double newInterestRate) {

        annualInterestRate = newInterestRate;
    }

    public static double calculateMonthlyInterest(double savings, double interest) {

        double total = (savings * interest) / 12;
        return savings + total;
    }

    public static void main(String[] args) {

        //SavingsAccount saver1 = new SavingsAccount(2000);
        //SavingsAccount saver2 = new SavingsAccount(3000);

        modifyInterestRate(annualInterestRate);

        double savingsBalance = 0;

        SavingsAccount.modifyInterestRate(0.04);
        double newbalance = calculateMonthlyInterest(savingsBalance, annualInterestRate);

        //System.out.println(saver1);
        //System.out.println(saver2);
        System.out.println("Derek");
    }


}

