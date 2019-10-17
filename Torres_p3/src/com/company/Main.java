
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
