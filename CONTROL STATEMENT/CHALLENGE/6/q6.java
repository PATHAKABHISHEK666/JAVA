//  ? Create a program to create a simple calculator that uses a switch statement to perform basic arithmetic operations like addition, subtraction, multiplication, division

import java.util.Scanner;;

public class q6 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please Press Operator To Perform :");
    System.out.println("+ for Add");
    System.out.println("- for Subtract");
    System.out.println("* for Multiply");
    System.out.println("/ for Divide");

    String operator = input.next();

    switch (operator) {
      case "+" -> add();
      case "-" -> sub();
      case "*" -> mul();
      case "/" -> div();

    }
    ;

  }

  public static void add() {
    System.out.println("Welcome to addition !");
    Scanner input = new Scanner(System.in);

    System.out.println("Enter The First Number : ");
    int num1 = input.nextInt();

    System.out.println("Enter The Second Number : ");
    int num2 = input.nextInt();

    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
  }

  public static void sub() {
    System.out.println("Welcome to Subtraction !");
    Scanner input = new Scanner(System.in);

    System.out.println("Enter The First Number : ");
    int num1 = input.nextInt();

    System.out.println("Enter The Second Number : ");
    int num2 = input.nextInt();

    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
  }

  public static void mul() {
    System.out.println("Welcome to Multiplication !");
    Scanner input = new Scanner(System.in);

    System.out.println("Enter The First Number : ");
    int num1 = input.nextInt();

    System.out.println("Enter The Second Number : ");
    int num2 = input.nextInt();

    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
  }

  public static void div() {
    System.out.println("Welcome to division !");
    Scanner input = new Scanner(System.in);

    System.out.println("Enter The First Number : ");
    float num1 = input.nextInt();

    System.out.println("Enter The Second Number : ");
    float num2 = input.nextInt();

    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
  }
}
