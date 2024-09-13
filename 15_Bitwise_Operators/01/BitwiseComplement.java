import java.util.Scanner;

/**
 * AND
 */
public class BitwiseComplement {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Showcasing Bitwise Not/Complement Operator!\n");

    System.out.println("Enter Your Number!");

    int number = scanner.nextInt();

    int result = ~number;

    System.out.println(result);
  }
}