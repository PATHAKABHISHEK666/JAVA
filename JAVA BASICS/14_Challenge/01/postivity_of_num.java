
import java.util.Scanner;

public class postivity_of_num {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please Enter The Number To Check");
    int number = input.nextInt();

    if (number > 0) {
      System.out.println("Entered Number Is Positive");
    } else if (number < 0) {
      System.out.println("Entered Number Is Negative");
    } else if (number == 0) {
      System.out.println("Entered Number Is Zero");
    }
  }
}
