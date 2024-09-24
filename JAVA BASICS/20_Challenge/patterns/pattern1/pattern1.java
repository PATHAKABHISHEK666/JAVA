import java.util.Scanner;

public class pattern1 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter The Number Of Rows To Print : ");

    int rows = scanner.nextInt();

    System.out.println("\n");

    int i = 1;
    while (i <= rows) {
      int j = 0;
      while (j < i) {
        System.out.print("* ");
        j++;
      }
      System.out.println("\n");
      i++;
    }

  }

}
