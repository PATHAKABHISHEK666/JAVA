// Write a program that prints the multiplication table of a given number..

import java.util.Scanner;

public class sumofOdds {

  public static void main(String[] args) {

    int number = input();
    System.out.println("\n");
    table(number);

  }

  public static int input() {
    Scanner number = new Scanner(System.in);

    System.out.println("Enter N terms :  ");
    int num = number.nextInt();

    return num;
  }

  public static void table(int num) {

    int count = 1;
    int sum = 0;

    while (count <= num) {

      if (count % 2 != 0) {
        sum += count;
      }
      count++;
    }

    System.out.println("The Sum of Odds Numbers Are: " + sum);
  }

}
