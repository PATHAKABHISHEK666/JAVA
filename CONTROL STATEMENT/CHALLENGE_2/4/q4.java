// ? Create a program to display if a number is prime or not.

public class q4 {
  public static boolean isPrime(int num) {
    // Edge cases for numbers less than 2
    if (num <= 1) {
      return false;
    }

    // Only go up to the square root of num
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    int number = 29;

    if (isPrime(number)) {
      System.out.println(number + " is a prime number.");
    } else {
      System.out.println(number + " is not a prime number.");
    }
  }
}
