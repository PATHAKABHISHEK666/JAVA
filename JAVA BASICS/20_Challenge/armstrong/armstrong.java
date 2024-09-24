import java.util.Scanner;;

public class armstrong {

  public static void main(String[] args) {
    int number = scanner();
    if (isArmstrong(number)) {
      System.out.println(number + " is an Armstrong number.");
    } else {
      System.out.println(number + " is not an Armstrong number.");
    }
  }

  public static int scanner() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    scanner.close();
    return num;
  }

  public static int power(int base, int exp) {
    int result = 1;
    for (int i = 0; i < exp; i++) {
      result *= base;
    }
    return result;
  }

  public static boolean isArmstrong(int num) {
    int originalNum = num;
    int sum = 0;
    int numDigits = String.valueOf(num).length(); // Calculate the number of digits

    while (num != 0) {
      int digit = num % 10; // Extract the last digit
      sum += power(digit, numDigits); // Add the power of the digit to the sum
      num /= 10; // Remove the last digit
    }

    return sum == originalNum; // If the sum is equal to the original number, it is Armstrong
  }

}
