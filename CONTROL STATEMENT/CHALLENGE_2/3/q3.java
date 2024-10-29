import java.util.Scanner;

public class q3 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Multiplication Table Maker:  ");

    System.out.println("\nEnter The Desired Number To Make Table");
    int num = input.nextInt();
    System.out.println("\nYou Multiplication Table is :\n");
    for (int i = 1; i <= 10; i++) {

      System.out.println(num + " * " + i + " = " + (num * i));

    }

  }
}
