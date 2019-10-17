
package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

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

    public static void Math(int difficulty) {

        int n = 10;
        int TOT = 0;
        int[] Quest = new int[n];
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            Quest[i] = newQuestion(difficulty);
            Scanner scnr = new Scanner(System.in);
            ans[i] = scnr.nextInt();
            System.out.println(Quest[i]);
            if (Quest[i] == ans[i]) {
                TOT = TOT + 1;
            }
        }
        double AVG = TOT / n;
        if (AVG < 0.75) {
            System.out.println("Please ask your teacher for extra help.");
        } else {
            System.out.println("Congratulations, you are ready to go to the next level!");

        }

        System.out.println("Enter difficulty level:");
        Scanner scnr = new Scanner(System.in);
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