// Write a program that prints the multiplication table of a given number..

import java.util.Scanner;

public class mult_table {

  public static void main(String[] args) {

    int number = input();
    System.out.println("\n");
    table(number);

  }

  public static int input() {
    Scanner number = new Scanner(System.in);

    System.out.println("Enter Your Desired Number To Print The Table :  ");
    int num = number.nextInt();

    return num;
  }

  public static void table(int num) {

    int count = 1;

    while (count <= 10) {

      System.out.println(num + " * " + count + " = " + count * num);

      count++;
    }
  }

}
