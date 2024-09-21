
public class merge {
  public static void main(String[] args) {

    int[] arr1 = { 1, 2, 3, 4 };
    int[] arr2 = { 5, 6, 7, 8 };

    int[] merged = new int[arr1.length + arr2.length];

    // BY Using LoOPs

    // for (int i = 0; i < arr2.length; i++) {
    // merged[i] = arr1[i];
    // }
    // for (int i = 0; i < arr2.length; i++) {
    // merged[arr1.length + i] = arr2[i];
    // }
    // --------------------------------------------

    for (int num : merged) {
      System.out.print(num + " ");
    }

  }
}
