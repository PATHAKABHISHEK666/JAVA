import java.util.Scanner;

public class calculateFloatingNumbs {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");

    float num1 = scanner.nextFloat();

    System.out.println("Enter second number");
    float num2 = scanner.nextFloat();

    System.out.println("_________________");

    float product = num1 * num2;

    System.out.println(product);
    scanner.close();
  }

}
