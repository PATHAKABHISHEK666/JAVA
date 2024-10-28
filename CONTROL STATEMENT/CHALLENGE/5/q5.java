// ! Create a program to print the month of the year based on a number (1-12) input by the user.

import java.util.Scanner;

public class q5 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter The Month Of Year To Print Name:  ");
    int month = input.nextInt();

    String monthStr = switch (month) {
      case 1 -> "Jan";
      case 2 -> "Feb";
      case 3 -> "Mar";
      case 4 -> "Apr";
      case 5 -> "May";
      case 6 -> "Jun";
      case 7 -> "Jul";
      case 8 -> "Aug";
      case 9 -> "Sep";
      case 10 -> "Oct";
      case 11 -> "Nov";
      case 12 -> "Dec";

      default -> "Invalid";
    };
    System.out.println(monthStr);

  }
}
