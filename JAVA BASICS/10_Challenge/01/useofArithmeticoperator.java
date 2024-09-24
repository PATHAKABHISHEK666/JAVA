import java.util.Scanner;

public class useofArithmeticoperator {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");

    int num1 = scanner.nextInt();

    System.out.println("Enter second number");
    int num2 = scanner.nextInt();

    System.out.println("_________________");

    System.out.println("ADD : " + (num1 + num2));
    System.out.println("SUB : " + (num1 - num2));
    System.out.println("MUL : " + (num1 * num2));
    System.out.println("DIV : " + (num1 / num2));
    System.out.println("MOD :" + (num1 % num2));

    scanner.close();

  }
}
