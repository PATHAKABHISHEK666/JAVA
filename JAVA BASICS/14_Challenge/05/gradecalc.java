import java.util.Scanner;

public class gradecalc {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Your Marks ! ");
    int marks = scanner.nextInt();

    if (marks > 90) {
      System.out.println("You Got Grade A");
    } else if (marks > 75 && marks <= 90) {
      System.out.println("You Got Grade B");
    } else if (marks > 60 && marks <= 75) {
      System.out.println("You Got Grade C");
    } else if (marks > 30 && marks <= 60) {
      System.out.println("You Got Grade D");
    } else if (marks < 30) {
      System.out.println("You Got Grade F");
    }
  }
}
