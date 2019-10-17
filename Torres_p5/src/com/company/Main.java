
package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static int addQuestion(int difficulty) {
        SecureRandom rand = new SecureRandom();
        int rand_int1;
        int rand_int2;
        int total;
        switch(difficulty) {
            case 1 :
                rand_int1 = rand.nextInt(10);
                rand_int2 = rand.nextInt(10);
                System.out.println("How much is " + rand_int1 + " plus " + rand_int2 + "?");
                total = rand_int1 + rand_int2;
                return total;

            case 2 :
                rand_int1 = rand.nextInt(100);
                rand_int2 = rand.nextInt(100);
                System.out.println("How much is " + rand_int1 + " plus " + rand_int2 + "?");
                total = rand_int1 + rand_int2;
                return total;

            case 3 :
                rand_int1 = rand.nextInt(1000);
                rand_int2 = rand.nextInt(1000);
                System.out.println("How much is " + rand_int1 + " plus " + rand_int2 + "?");
                total = rand_int1 + rand_int2;
                return total;

            default :
                rand_int1 = rand.nextInt(10000);
                rand_int2 = rand.nextInt(10000);
                System.out.println("How much is " + rand_int1 + " plus " + rand_int2 + "?");
                total = rand_int1 + rand_int2;
                return total;

        }
    }

    public static int subQuestion(int difficulty) {
        SecureRandom rand = new SecureRandom();
        int rand_int1;
        int rand_int2;
        int total;
        switch(difficulty) {
            case 1 :
                rand_int1 = rand.nextInt(10);
                rand_int2 = rand.nextInt(10);
                System.out.println("How much is " + rand_int1 + " minus " + rand_int2 + "?");
                total = rand_int1 - rand_int2;
                return total;

            case 2 :
                rand_int1 = rand.nextInt(100);
                rand_int2 = rand.nextInt(100);
                System.out.println("How much is " + rand_int1 + " minus " + rand_int2 + "?");
                total = rand_int1 - rand_int2;
                return total;

            case 3 :
                rand_int1 = rand.nextInt(1000);
                rand_int2 = rand.nextInt(1000);
                System.out.println("How much is " + rand_int1 + " minus " + rand_int2 + "?");
                total = rand_int1 - rand_int2;
                return total;

            default :
                rand_int1 = rand.nextInt(10000);
                rand_int2 = rand.nextInt(10000);
                System.out.println("How much is " + rand_int1 + " minus " + rand_int2 + "?");
                total = rand_int1 - rand_int2;
                return total;

        }
    }



    public static int newQuestion(int difficulty) {
        SecureRandom rand = new SecureRandom();
        int rand_int1;
        int rand_int2;
        int total;
        switch(difficulty) {
            case 1 :
                rand_int1 = rand.nextInt(10);
                rand_int2 = rand.nextInt(10);
                System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
                total = rand_int1 * rand_int2;
                return total;

            case 2 :
                rand_int1 = rand.nextInt(100);
                rand_int2 = rand.nextInt(100);
                System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
                total = rand_int1 * rand_int2;
                return total;

            case 3 :
                rand_int1 = rand.nextInt(1000);
                rand_int2 = rand.nextInt(1000);
                System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
                total = rand_int1 * rand_int2;
                return total;

            default :
                rand_int1 = rand.nextInt(10000);
                rand_int2 = rand.nextInt(10000);
                System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
                total = rand_int1 * rand_int2;
                return total;

        }
    }

    public static int divQuestion(int difficulty) {
        SecureRandom rand = new SecureRandom();
        int rand_int1;
        int rand_int2;
        int total;
        switch(difficulty) {
            case 1 :
                rand_int1 = rand.nextInt(10);
                rand_int2 = rand.nextInt(10);
                System.out.println("How much is " + rand_int1 + " divided by " + rand_int2 + "?");
                total = rand_int1 / rand_int2;
                return total;

            case 2 :
                rand_int1 = rand.nextInt(100);
                rand_int2 = rand.nextInt(100);
                System.out.println("How much is " + rand_int1 + " divided by " + rand_int2 + "?");
                total = rand_int1 / rand_int2;
                return total;

            case 3 :
                rand_int1 = rand.nextInt(1000);
                rand_int2 = rand.nextInt(1000);
                System.out.println("How much is " + rand_int1 + " divided by " + rand_int2 + "?");
                total = rand_int1 / rand_int2;
                return total;

            default :
                rand_int1 = rand.nextInt(10000);
                rand_int2 = rand.nextInt(10000);
                System.out.println("How much is " + rand_int1 + " divided by " + rand_int2 + "?");
                total = rand_int1 / rand_int2;
                return total;

        }
    }

    public static void Math(int difficulty) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter selection number:");
        int selecnum = scnr.nextInt();

        if (selecnum == 5){
            SecureRandom rand = new SecureRandom();
            selecnum = rand.nextInt(5);
        }
        if (selecnum == 1) {

            int TOT = 0;
            double[] Quest = new double[10];
            double[] ans = new double[10];
            for (int i = 0; i < 10; i++) {
                Quest[i] = addQuestion(difficulty);
                ans[i] = scnr.nextInt();
                if (Quest[i] == ans[i]) {
                    TOT = TOT + 1;
                }
            }
            double AVG = TOT / 10;
            if (AVG < 0.75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
        }
        else if (selecnum == 2) {

            int TOT = 0;
            double[] Quest = new double[10];
            double[] ans = new double[10];
            for (int i = 0; i < 10; i++) {
                Quest[i] = newQuestion(difficulty);
                ans[i] = scnr.nextInt();
                if (Quest[i] == ans[i]) {
                    TOT = TOT + 1;
                }
            }
            double AVG = TOT / 10;
            if (AVG < 0.75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
        }
        else if (selecnum == 3) {

            int TOT = 0;
            double[] Quest = new double[10];
            double[] ans = new double[10];
            for (int i = 0; i < 10; i++) {
                Quest[i] = subQuestion(difficulty);
                ans[i] = scnr.nextInt();
                if (Quest[i] == ans[i]) {
                    TOT = TOT + 1;
                }
            }
            double AVG = TOT / 10;
            if (AVG < 0.75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
        }
        else if (selecnum == 4) {

            int TOT = 0;
            double[] Quest = new double[10];
            double[] ans = new double[10];
            for (int i = 0; i < 10; i++) {
                Quest[i] = divQuestion(difficulty);
                ans[i] = scnr.nextInt();
                if (Quest[i] == ans[i]) {
                    TOT = TOT + 1;
                }
            }
            double AVG = TOT / 10;
            if (AVG < 0.75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
        }

            System.out.println("Enter difficulty level:");

            difficulty = scnr.nextInt();
            while ( difficulty < 1 || difficulty >4){
                System.out.println("Enter number 1-4:");
                difficulty = scnr.nextInt();
            }
            Math(difficulty);
        }


    public static void main(String[] args) {

        System.out.println("Enter difficulty level:");

        int difficulty;
        Scanner scnr = new Scanner(System.in);
        difficulty = scnr.nextInt();

        while ( difficulty < 1 || difficulty >4){
            System.out.println("Enter number 1-4:");
            difficulty = scnr.nextInt();
        }
        Math(difficulty);
    }
}