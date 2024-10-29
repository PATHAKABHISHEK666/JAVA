// ! Create a program using do-while to find password checker until a valid password is entered.

import java.util.Scanner;

public class q1 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String password = "hello";
    String str;

    do {

      System.out.println("Enter The Password To Check : ");
      str = input.nextLine();

    } while (password.equals(str) == false);

    System.out.println("Correct Password!!");
  }
}
