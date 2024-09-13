import java.util.Scanner;

public class evenorodd {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("WELCOME TO ODD EVEN CALC\n");
    System.out.println("Please Enter Your Number");
    int num = input.nextInt();

    if ((num & 1) == 1) {
      System.out.println("Your Number is ODD");
    } else {
      System.out.println("Your Number is EVEN");
    }
  }
}
