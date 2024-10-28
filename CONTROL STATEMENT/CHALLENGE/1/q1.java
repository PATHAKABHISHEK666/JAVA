
// !  CREATE A PROGRAM TO FIND THE MINIMUM OF TWO NUMBERS.
import java.util.Scanner;;

public class q1 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first number: ");
    int num1 = input.nextInt();
    System.out.println("Enter the second number: ");
    int num2 = input.nextInt();

    int minimum = num1 < num2 ? num1 : num2;

    System.out.println(minimum + " is minimum between two numbers !");

  }
}
