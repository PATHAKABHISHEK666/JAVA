
import java.util.Scanner;

public class FibonacciSeries {
  // Function to print Fibonacci series up to n terms
  public static void printFibonacci(int n) {
    int a = 0, b = 1, next;

    System.out.print("Fibonacci Series: " + a + " " + b); // Print the first two terms

    for (int i = 2; i < n; i++) {
      next = a + b;
      System.out.print(" " + next);
      a = b;
      b = next;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of terms: ");
    int n = scanner.nextInt();

    // Print Fibonacci series
    if (n >= 2) {
      printFibonacci(n);
    } else {
      System.out.println("Enter a number greater than or equal to 2.");
    }

    scanner.close();
  }
}
