import java.util.Scanner;

public class Add_Two_Nums {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter The First Number: ");
    int number1 = input.nextInt();

    System.out.println("Enter The Second Number: ");
    int number2 = input.nextInt();

    int sum = number1 + number2;

    System.out.print("The Sum Of " + number1 + " and " + number2 + " = " + sum);
    // System.out.print(sum);

    input.close();
  }
}
