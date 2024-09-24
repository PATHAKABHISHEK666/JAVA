
import java.util.Scanner;

public class factorial {
  public static void main(String[] args) {
    int num = input();
    factorial(num);
  }

  public static int input() {
    Scanner number = new Scanner(System.in);

    System.out.println("Enter N terms :  ");
    int num = number.nextInt();

    System.out.println("\n");
    return num;
  }

  public static void factorial(int num) {

    int product = 1;

    while (num >= 1) {

      product *= num;

      num--;
    }

    System.out.println("The Factorial Of Number is : " + product);
  }
}
