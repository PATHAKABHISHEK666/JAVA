
//  ?  CREATE  A PROGRAM TO CALCULATE THE ABSOLUTE VALUE OF A GIVEN INTEGER.
import java.util.Scanner;

public class q3 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter The Number To Calculate");
    int num = input.nextInt();

    num = num < 0 ? num *= -1 : num;

    System.out.println("The Absolute Value of Entered Number is : " + num);

  }
}
