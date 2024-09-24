import java.util.Scanner;

/**
 * AND
 */
public class leftshift {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Showcasing LeftShift Operator!\n");

    System.out.println("Enter Your Number!");

    int number = scanner.nextInt();

    int result = number << 4;

    System.out.println(result);
  }
}