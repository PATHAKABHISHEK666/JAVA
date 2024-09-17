import java.util.Scanner;

public class arraySearch {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[] arr = { 2, 3, 4, 5, 6, 7, 8 };

    System.out.println("Welcome to Array Searching : ");

    System.out.println("Enter The Number you want to search : ");
    int num = input.nextInt();

    boolean isFound = isFound(arr, num);

    if (isFound) {
      System.out.println("Your Number was found in the array ! ");
    } else {
      System.out.println("Your Number was Not found in the array ! ");
    }

  }

  public static boolean isFound(int[] arr, int num) {

    int index = 0;

    while (index < arr.length) {

      if (arr[index] == num) {
        return true;
      }
      index++;

    }
    return false;

  }
}
