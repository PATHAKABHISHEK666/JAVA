// ? Create  a program using continue to sum all positive numbers entered by the user; skip  any negative numbers.

import java.util.Scanner;

public class q8 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter The 5 Numbers to find sum: ");
    int[] numbers = new int[5];
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = input.nextInt();

      if (numbers[i] < 0) {
        continue;
      }
      sum += numbers[i];

    }

    System.out.println("The Sum of Numbers : " + sum);

  }
}
