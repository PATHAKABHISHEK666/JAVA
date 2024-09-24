import java.util.Scanner;

public class return_statement {

  public static void main(String[] args) {

    greet();
    int firstNum = readNumber();

    int secondNum = readNumber();

    int sum = sumNumber(firstNum, secondNum);
    System.out.println("Sum of the Numbers = : " + sum);

  }

  public static int readNumber() {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the number");

    int firstNumber = input.nextInt();

    return firstNumber;
  }

  public static int sumNumber(int a, int b) {
    return a + b;
  }

  public static void greet() {
    System.out.println("Welcome to Calculator");

  }

}
