import java.util.Scanner;

public class gdc {
  // Function to calculate the GCD (Greatest Common Divisor) using the Euclidean
  // algorithm
  public static int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter second number: ");
    int num2 = scanner.nextInt();

    int gcd = gcd(num1, num2);
    System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

    scanner.close();
  }
}
