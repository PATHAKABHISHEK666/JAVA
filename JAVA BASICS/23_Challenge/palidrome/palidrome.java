import java.util.Scanner;

public class palidrome {

  public static void main(String[] args) {

    int number;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter The Number To Check !");

    number = scanner.nextInt();

    if (palidromeNum(number)) {
      System.out.println("Number Is Palidrome!");
    } else {
      System.out.println("Number Is Not Palidrome");
    }

  }

  // Mathematical Approach

  // public static boolean palidromeNum(int num) {

  // int Original = num;
  // int reversed = 0;

  // while (num != 0) {

  // int digit = num % 10;

  // reversed = reversed * 10 + digit;

  // num /= 10;
  // }

  // return reversed == Original;

  // }

  public static boolean palidromeNum(int num) {

    String str = String.valueOf(num);

    String reverseString = new StringBuilder(str).reverse().toString();

    return str.equals(reverseString);

  }

}
