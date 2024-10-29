// ? Create a program using do-while to implement a number guessing game

import java.util.Scanner;

public class q2 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int number = 8;

    System.out.println("Welcome to Number Guessing Game ::");

    System.out.println("Please Enter The Number Between (0-9) to check ::");
    int guess;
    do {
      guess = input.nextInt();
    } while (guess != number);

    System.out.println("You WoN You Guess To Correct Number " + guess);

  }
}
