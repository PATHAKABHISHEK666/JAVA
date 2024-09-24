import java.util.Scanner;

public class palidrome {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter The Number: ");
    int num = scanner.nextInt();

    if (isPalindrome(num)) {
      System.out.println("Entered Number " + num + " Is Palidrome ! ");
    } else {
      System.out.println("Entered Number " + num + " Is Not Palidrome ! ");
    }
  }

  public static boolean isPalindrome(int number) {

    // Function to check if a number is a palindrome

    int original = number;
    int reversed = 0;

    while (number != 0) {
      int digit = number % 10; // Extract the last digit
      reversed = reversed * 10 + digit; // Append the digit to the reversed number
      number /= 10; // Remove the last digit from the number
    }
    return original == reversed;
  }
}
