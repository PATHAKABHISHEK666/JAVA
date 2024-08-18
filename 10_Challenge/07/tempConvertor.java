import java.util.Scanner;

public class tempConvertor {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input the principal amount
    System.out.print("Enter Temperature in Fahrenheit ");
    float fah = scanner.nextFloat();

    float cel = (fah - 32) * 5 / 9;

    System.out.println("Temperature in Celsius: " + cel);
    scanner.close();

  }

}
