import java.util.Scanner;

public class swap {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to Swapping Station\n\n");

    System.out.println("Enter Value of First Number");
    int num1 = input.nextInt();

    System.out.println("Enter Value of Second Number");
    int num2 = input.nextInt();

    System.out.println("num1: " + num1);
    System.out.println("num2: " + num2);

    System.out.println("\nSWAPPED---------------------->\n");

    num1 = num1 + num2;
    num2 = num1 - num2;
    num1 = num1 - num2;

    System.out.println("num1: " + num1);
    System.out.println("num2: " + num2);
    
    input.close();
  }
}