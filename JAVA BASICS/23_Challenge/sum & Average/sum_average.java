import java.util.Scanner;

public class sum_average {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter how many numbers you want to print :");
    int terms = scanner.nextInt();

    int[] numbers = new int[terms]; // Creates an array of integers with size 5

    int i = 0;
    int sum = 0;

    System.out.println("Enter The Numbers To Find Sum : \n");

    while (terms > i) {

      numbers[i] = scanner.nextInt();
      sum += numbers[i];
      i++;

    }

    System.out.println("\n");
    System.out.println("The Sum Of all Numbers : " + sum);
    System.out.println("\n");
    System.out.println("The Average Of all Numbers : " + (float) sum / terms);
  }
}
