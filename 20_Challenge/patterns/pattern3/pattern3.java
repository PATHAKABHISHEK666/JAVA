import java.util.Scanner;

public class pattern3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input the number of rows
    System.out.print("Enter the number of rows: ");
    int rows = sc.nextInt();

    int i = 1; // Initialize row counter

    // Outer loop for rows
    while (i <= rows) {
      int j = 1; // Initialize space counter
      // Inner loop for spaces
      while (j <= rows - i) {
        System.out.print(" ");
        j++;
      }

      int k = 1; // Initialize star counter
      // Inner loop for stars
      while (k <= i) {
        System.out.print("*");
        k++;
      }

      // Move to the next line
      System.out.println();

      i++; // Increment the row counter
    }

    sc.close();
  }
}
