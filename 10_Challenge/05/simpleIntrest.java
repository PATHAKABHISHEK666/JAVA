import java.util.Scanner;

public class simpleIntrest {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter value of principal : ");
    float principal = scanner.nextFloat();
    System.out.print("Enter value of rate : ");
    float rate = scanner.nextFloat();
    System.out.print("Enter value of time : ");
    float time = scanner.nextFloat();

    float si = (principal * rate * time) / (100);

    System.out.println("Simple Intrest : " + si);

    scanner.close();

  }
}
