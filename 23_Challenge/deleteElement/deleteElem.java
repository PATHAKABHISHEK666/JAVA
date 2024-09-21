import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class deleteElem {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

    System.out.println("Enter The Element You Want To Delete :");
    int num = scanner.nextInt();

    System.out.println("Original Array: " + Arrays.toString(arr));

    int[] newArr = removeElement(arr, num);

    System.out.println("Array after removing element " + num + ": " + Arrays.toString(newArr));

  }

  public static int[] removeElement(int[] arr, int num) {

    int count = 0;

    for (int i : arr) {
      if (i == num) {
        count++;
      }
    }

    int[] newArr = new int[arr.length - count];
    int index = 0;

    for (int i : arr) {

      if (i != num) {
        newArr[index++] = i;
      }

    }

    return newArr;

  }

}
