import java.util.Scanner;

public class PrimeCheck {
  // Function to check if a number is prime
  public static boolean isPrime(int num) {
    // Edge cases for numbers less than or equal to 1
    if (num <= 1) {
      return false;
    }

    // Check divisibility from 2 to the square root of the number
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }

    return true; // If no divisors found, the number is prime
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    if (isPrime(num)) {
      System.out.println(num + " is a prime number.");
    } else {
      System.out.println(num + " is not a prime number.");
    }

    scanner.close();
  }
}
