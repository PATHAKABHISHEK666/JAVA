import java.util.Scanner;

public class ageGroup {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Your Age ! ");
    int age = scanner.nextInt();

    if (age >= 60) {
      System.out.println("You Are Senior");
    } else

    if (age < 60) {
      if (age < 13) {
        System.out.println("You Are Child");
      } else if (age < 20) {
        System.out.println("You Are Teen");
      } else {
        System.out.println("You Are Adult");

      }
    }
  }
}
