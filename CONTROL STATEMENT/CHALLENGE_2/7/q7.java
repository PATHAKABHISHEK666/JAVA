// ? Create a program using break to read inputs from the user in a loop and break the loop if a specific keyword (like "exit") is entered.

import java.util.Scanner;

public class q7 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String str;
    String string = "exit";
    System.out.println("Enter The KeyWord:");

    while (true) {

      str = input.nextLine();

      if (string.equals(str)) {
        break;
      }

    }

    System.out.println("Exited!");

  }

}
