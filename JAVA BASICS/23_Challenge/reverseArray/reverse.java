
public class reverse {

  public static void main(String[] args) {

    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 }; // Array of integers
    System.out.println("\n");

    System.out.println("Original Array : ");

    for (int num : arr) {
      System.out.print(num + " ");
    }

    System.out.println("\n");

    System.out.println("Reversed Array : ");

    for (int num : reversed(arr)) {
      System.out.print(num + " ");
    }

    System.out.println("\n");

  }

  public static int[] reversed(int[] arr) {

    int start = 0;
    int end = arr.length - 1;

    while (start < end) {

      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;

    }
    return arr;

  }

}
