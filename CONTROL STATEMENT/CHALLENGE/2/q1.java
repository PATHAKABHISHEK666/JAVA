
// !  CREATE A PROGRAM TO FIND IF GIVEN NU BER IS EVEN OR ODD.
import java.util.Scanner;;

public class q1 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the number to check:  ");
    int num = input.nextInt();

    String str = num % 2 == 0 ? "even" : "odd";

    System.out.println(num + " is " + str);

  }
}
