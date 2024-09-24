import java.util.Scanner;

/**
 * AND
 */
public class OR {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Showcasing Bitwise OR Operator!\n");

    System.out.println("Please enter the first number: ");

    int first = scanner.nextInt();

    System.out.println("Now Enter the other number");

    int second = scanner.nextInt();

    int result = first | second;

    System.out.println("Your Result is: " + result);

  }
}