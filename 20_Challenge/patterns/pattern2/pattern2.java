import java.util.Scanner;

public class pattern2 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter The Number Of Rows To Print : ");

    int rows = scanner.nextInt();

    System.out.println("\n");

    while (rows != 0) {

      int j = rows;
      while (j > 0) {
        System.out.print("* ");
        j--;
      }
      System.out.println("\n");
      rows--;

    }

  }

}
