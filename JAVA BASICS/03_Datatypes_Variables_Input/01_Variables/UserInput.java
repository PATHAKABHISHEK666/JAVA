import java.util.Scanner;

public class UserInput {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Please enter your name: ");

    String name = input.nextLine();

    System.out.println("GooD Morning " + name);

    System.out.println(name + ", Also Tell me Your Age");

    int age = input.nextInt();

    System.out.println("Your Age is : " + age);

    input.close(); // Closing the Scanner manually

  }
}
