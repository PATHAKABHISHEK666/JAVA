
// ! Create a program using continue to print only even numbers using continue for odd numbers.

public class q9 {
  public static void main(String[] args) {

    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

    for (int i : numbers) {
      if (i % 2 != 0) {
        continue;
      }
      System.out.print(i + " ");
    }

  }
}
