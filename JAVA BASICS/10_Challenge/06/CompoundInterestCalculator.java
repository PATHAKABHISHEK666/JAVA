import java.util.Scanner;

public class CompoundInterestCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input the principal amount
    System.out.print("Enter the principal amount (P): ");
    double principal = scanner.nextDouble();

    // Input the annual interest rate
    System.out.print("Enter the annual interest rate (R): ");
    double rate = scanner.nextDouble();

    // Input the time period in years
    System.out.print("Enter the time period in years (t): ");
    int time = scanner.nextInt();

    // Calculate the amount
    double amount = principal * Math.pow((1 + rate / 100), time);

    // Calculate the compound interest
    double compoundInterest = amount - principal;

    // Output the results
    System.out.println("Compound Interest: " + compoundInterest);
    System.out.println("Total Amount: " + amount);

    scanner.close();
  }
}
