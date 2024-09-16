import java.util.Scanner;

public class while_loops {
  public static void main(String[] args) {

    Scanner times = new Scanner(System.in);
    System.out.println("Enter The Number of Times!");

    int time = times.nextInt();

    while (time > 0) {
      System.out.println("Hello While Loop");
      time--;
    }

  }
}
