
package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static int mathQuestion(int difficulty, int selection) {

        SecureRandom rand = new SecureRandom();
        int rand_int1;
        int rand_int2;
        int total;

        if (difficulty == 1) {
            rand_int1 = rand.nextInt(10);
            rand_int2 = rand.nextInt(10);
        }
        else if (difficulty == 2) {
            rand_int1 = rand.nextInt(100);
            rand_int2 = rand.nextInt(100);
        }
        else if (difficulty == 3) {
            rand_int1 = rand.nextInt(1000);
            rand_int2 = rand.nextInt(1000);
        }

        else {
            rand_int1 = rand.nextInt(10000);
            rand_int2 = rand.nextInt(10000);
        }
        switch(selection){
            case 1:
                System.out.println("How much is " + rand_int1 + " plus " + rand_int2 + "?");
                total = rand_int1 + rand_int2;
                return total;
            case 2:
                System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
                total = rand_int1 * rand_int2;
                return total;
            case 3:
                System.out.println("How much is " + rand_int1 + " minus " + rand_int2 + "?");
                total = rand_int1 - rand_int2;
                return total;
            default:
                System.out.println("How much is " + rand_int1 + " divided by " + rand_int2 + "?");
                total = rand_int1 / rand_int2;
                return total;

        }

    }

    public static void Math(int difficulty) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter selection number:");
        int selecnum = scnr.nextInt();


            int TOT = 0;
            double[] Quest = new double[10];
            double[] ans = new double[10];

            if (selecnum == 5) {
                SecureRandom rand = new SecureRandom();
                selecnum = rand.nextInt(5);
            }
                for (int i = 0; i < 10; i++) {
                    Quest[i] = mathQuestion(difficulty, selecnum);
                    ans[i] = scnr.nextInt();
                    if (Quest[i] == ans[i]) {
                        TOT = TOT + 1;
                    }
                }
            double AVG = TOT / 10;
            if (AVG < 0.75) {
                System.out.println("Please ask your teacher for extra help.");
            }
            else {
                System.out.println("Congratulations, you are ready to go to the next level!");
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

//Part 1
/*
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

    public static void MultiQuestions(int ans, int total){

        Scanner scnr = new Scanner(System.in);

        while (ans != (total)) {
            System.out.println("No. Please try again.>again.");
            ans = scnr.nextInt();
            while (ans == total) {
                System.out.println("Very good!");
                total = newQuestion();
                ans = scnr.nextInt();
            }
            while (ans == (total)) {
                System.out.println("Very good!");
                total = newQuestion();
                ans = scnr.nextInt();
                while (ans == total) {
                    System.out.println("No. Please try again.>again.");
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
 */

// Part 2

/*
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
 */

// Part 3

/*

package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static int newQuestion() {
        SecureRandom rand = new SecureRandom();
        int rand_int1 = rand.nextInt(10);
        int rand_int2 = rand.nextInt(10);
        System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
        int total = rand_int1 * rand_int2;
        return total;
    }
    public static void Math() {
      int n = 4;
      int TOT = 0;
      int[] Quest = new int[n];
      int[] ans = new int[n];
      for (int i = 0; i < n; i++) {
          Quest[i] = newQuestion();
          Scanner scnr = new Scanner(System.in);
          ans[i] = scnr.nextInt();
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
      Math();
  }

  public static void main(String[] args) {
      Math();
    }
}

 */

// Part 4
/*

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
 */