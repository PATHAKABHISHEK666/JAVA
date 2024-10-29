// ? Create a program using for-each to the occurrences of a specific element in an array.

import java.util.Scanner;

public class q6 {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 2, 1, 3, 1, 2, 1, 2, 3, 4, 1, 6, 5, 6, 7, 3, 4, 6, 2, 5, 7, 1, 2, 2, 1, 3, 1, 2, 1, 2, 3, 4,
        1, 6, 5, 6, 7, 3, 4, 6, 2, 5, 7, 77 };

    Scanner input = new Scanner(System.in);

    int occurrences = 0;

    System.out.println("Enter the desired number to find occurrences");
    int num = input.nextInt();

    for (int number : numbers) {
      if (number == num) {
        occurrences++;
      }
    }

    System.out.println(num + " Occurred " + occurrences + " Times ");

  }
}
