
//  ! Create a program to Based on Student's score, categorize as "High", "Moderate", or "Low" using the ternary operator 

import java.util.Scanner;

public class q4 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter The Student Score :");
    int score = input.nextInt();

    String category = score > 80 ? "High" : score > 50 ? "Moderate" : "Low";

    System.out.println("Your Category is " + category + " after getting " + score);

  }
}
