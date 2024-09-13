import java.util.Scanner;

public class greatestOfThree {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please Enter First Number");
    int num1 = input.nextInt();
    System.out.println("Please Enter Second Number");
    int num2 = input.nextInt();
    System.out.println("Please Enter Third Number");
    int num3 = input.nextInt();

    if (num1 > num2 && num1 > num3) {
      System.out.println("Number one is Greatest Among");
    } else if (num2 > num1 && num2 > num3) {
      System.out.println("Number Two is Greatest Among");
    } else if (num3 > num1 && num3 > num2) {
      System.out.println("Number Three is Greatest Among");
    }
  }
}
