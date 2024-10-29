// Create a program using recursion to check if a string is a palindrome using recursion

import java.util.Scanner;

public class q11 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to Palindrome Checker");

    System.out.println("Enter the string to be checked: ");
    String str = input.next();
    System.out.println("Your String is " + ((isPalindrome(str)) ? "Palindrome" : "Not Palindrome"));
  }

  public static boolean isPalindrome(String str) {

    if (str.length() <= 1) {
      return true;
    }
    int lastPos = str.length() - 1;
    if (str.charAt(0) == str.charAt(lastPos)) {
      return false;
    }
    String newStr = str.substring(1, lastPos);

    return isPalindrome(newStr);
  }
}
