package com.company;
import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static int newQuestion(){
        // create instance of SecureRandom class
        SecureRandom rand = new SecureRandom();
        // Generate random integers in range 0 to 9
        int rand_int1 = rand.nextInt(10);
        int rand_int2 = rand.nextInt(10);
        System.out.println("How much is " + rand_int1 + " times " + rand_int2+ "?");
        int total = (rand_int1*rand_int2);
        return total;
    }

    public static void PositiveStatement(){
        // switch statement
        SecureRandom rand = new SecureRandom();
        int rand_int = rand.nextInt(5);
        switch(rand_int)
        {
            // values must be of same type of expression
            case 1 :
                System.out.println("Very good!");
                break;
            case 2 :
                System.out.println("Excellent!");
                break;

            case 3:
                System.out.println("Nice work!");
                break;
            default :
                System.out.println("Keep up the good work!");
        }

    }

    public static void NegativeStatement(){
        // switch statement
        SecureRandom rand = new SecureRandom();
        int rand_int = rand.nextInt(5);
        switch(rand_int)
        {
            // values must be of same type of expression
            case 1 :
                System.out.println("No. Please try again.");
                break;
            case 2 :
                System.out.println("Wrong. Try once more.");
                break;

            case 3:
                System.out.println("Don’t give up!");
                break;
            default:
                System.out.println("No. Keep trying.");
                break;
        }

    }

    public static void main(String[] args) {

        int total;
        total = newQuestion();
        // Print out request with random integers
        Scanner scnr = new Scanner(System.in);
        int ans = scnr.nextInt();
        while(ans != (total)){
            NegativeStatement();
            ans = scnr.nextInt();
            while(ans == total){
                PositiveStatement();
                total = newQuestion();
                ans = scnr.nextInt();
            }
        }
        // write your code here
    }
}