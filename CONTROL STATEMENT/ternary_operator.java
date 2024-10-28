import java.util.Scanner;

public class ternary_operator {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("WELCOME TO NUMBER CHECKER");
    System.out.println("PLEASE ENTER YOUR FIRST NUMBER");
    int num1 = input.nextInt();
    System.out.println("PLEASE ENTER YOUR SECOND NUMBER");
    int num2 = input.nextInt();

    // int greater;
    // if (num1 > num2) {
    // greater = num1;
    // } else {
    // greater = num2;
    // }

    int greater = num1 > num2 ? num1 : num2;

    System.out.println(greater + " IS THE GREATEST");

  }

}