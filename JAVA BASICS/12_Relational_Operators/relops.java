import java.util.Scanner;

public class relops {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to Driving License Portal");
    System.out.println("Please Enter Your Age: ");
    int age = input.nextInt();

    if (age >= 18) {
      System.out.println("You Are eligible to drive");
    } else {
      System.out.println("Beta Cycle Chalao");
    }
  }
}
