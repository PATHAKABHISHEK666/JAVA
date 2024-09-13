import java.util.Scanner;

public class oddorEven {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Please Enter Your Number");
    int number = input.nextInt();

    if (number % 2 == 0) {
      System.out.println("Entered Number Is Even");
    }

    else {
      System.out.println("Entered Number Is ODD");
    }

  }
}
