package com.company;
import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static int newQuestion() {

        // create instance of SecureRandom class
        SecureRandom rand = new SecureRandom();
        // Generate random integers in range 0 to 9
        int rand_int1 = rand.nextInt(10);
        int rand_int2 = rand.nextInt(10);
        System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
        int total = (rand_int1 * rand_int2);
        return total;
    }

    public static void PositiveAns(){

        SecureRandom rand = new SecureRandom();
        // Generate random integers in range 0 to 9
        int rand_int1 = rand.nextInt(4);
        
        switch (rand_int1){
            
            case 1:
                System.out.println("Very good!");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice work!");
                break;
            default:
                System.out.println("Keep up the good work!");
        }
    }

    public static void NegativeAns(){

        SecureRandom rand = new SecureRandom();
        // Generate random integers in range 0 to 9
        int rand_int1 = rand.nextInt(4);

        switch (rand_int1){

            case 1:
                System.out.println("No. Please try again.");
                break;
            case 2:
                System.out.println("Wrong. Try once more.");
                break;
            case 3:
                System.out.println("Don’t give up!");
                break;
            default:
                System.out.println("No. Keep trying.");
        }
    }
    
    public static void MultiQuestions(int ans, int total){

        Scanner scnr = new Scanner(System.in);

        while (ans != (total)) {
            System.out.println(NegativeAns(););
            ans = scnr.nextInt();
            while (ans == total) {
                System.out.println(PositiveAns(););
                total = newQuestion();
                ans = scnr.nextInt();
            }
            while (ans == (total)) {
                System.out.println(PositiveAns(););
                total = newQuestion();
                ans = scnr.nextInt();
                while (ans == total) {
                    System.out.println(NegativeAns(););
                    ans = scnr.nextInt();
                }
            }

        }
    }
    public static void main(String[] args) {

        int total;
        //produces questions for user.
        total = newQuestion();

        //scans user answer
        Scanner scnr = new Scanner(System.in);
        int ans = scnr.nextInt();

        MultiQuestions(ans, total);

    }
}