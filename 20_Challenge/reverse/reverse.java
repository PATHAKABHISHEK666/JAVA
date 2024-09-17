import java.util.Scanner;

public class reverse {
  public static void main(String[] args) {

    Scanner number = new Scanner(System.in);

    System.out.println("Enter The Number To Reverse : ");

    int num = number.nextInt();

    int reversedNum = reverse(num);
    System.out.println("Reversed number: " + reversedNum);

  }

  public static int reverse(int num) {

    int reversed = 0;
    while (num != 0) {

      int digit = num % 10;

      reversed = reversed * 10 + digit;

      num /= 10;

    }
    return reversed;
  }
}
