import java.util.Scanner;

public class max_and_min {
  public static void main(String[] args) {

    int[] numbers = { 23, 15, 42, 8, 67, 91, 34, 5, 76, 58 };

    int max, min;
    max = 0;
    min = numbers[0];

    int i = 0;

    while (i < numbers.length) {

      if (numbers[i] > max) {
        max = numbers[i];

      }
      if (numbers[i] < min) {
        min = numbers[i];
      }

      i++;
    }

    System.out.println("The Maximum Element In Array Is : " + max);
    System.out.println("The Minimum Element In Array Is : " + min);

  }
}
