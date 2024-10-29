import java.util.Scanner;

public class dowhile {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // System.out.println("Enter your age :");
    int age = 0;

    // while (age < 0 || age > 100) {
    // System.out.println("Enter your age :");
    // age = input.nextInt();
    // }

    do {
      System.out.println("Enter your age :");
      age = input.nextInt();
    } while (age < 0 || age > 100);
    System.out.println("Your age is :" + age);
  }

}
