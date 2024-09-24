import java.util.Scanner;

public class noofOccourance {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] numbers = { 1, 2, 3, 4, 5, 6, 4, 3, 1 }; // Creates an array with these values

    System.out.println("Enter The Number You Want To Check  ! ");

    int num = scanner.nextInt();

    int count = 0;
    int i = 0;

    while (numbers.length > i) {

      if (numbers[i] == num) {
        count++;
      }
      i++;
    }

    System.out.println(num + " Occurs " + count + " In the Given Array! ");

  }
}
