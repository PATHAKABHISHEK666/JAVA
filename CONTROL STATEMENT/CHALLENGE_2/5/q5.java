
// * Create a program using for-each to find the maximum value in an integer array  */

public class q5 {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5, 61, 7, 8, 9, 10 };
    int max = numbers[0];
    for (int number : numbers) {
      if (number > max) {
        max = number;
      }
    }

    System.out.println("\n" + max + " is maximum elements in array");

  }
}
