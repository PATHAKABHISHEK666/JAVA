
import java.util.Scanner;

public class digitsum {

  public static void main(String[] args) {
    int num = input();
    sumofDigit(num);
  }

  public static int input() {
    Scanner number = new Scanner(System.in);

    System.out.println("Enter N terms :  ");
    int num = number.nextInt();

    System.out.println("\n");
    return num;
  }

  public static void sumofDigit(int num) {
    int sum = 0;
    int number = num;
    while (num != 0) {

      sum += num % 10;

      num /= 10;
    }
    System.out.println("The sum of digits of Number " + number + " is " + sum);
  }

}
