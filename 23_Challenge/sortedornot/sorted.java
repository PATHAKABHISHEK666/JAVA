
public class sorted {
  public static void main(String[] args) {
    int[] numbers = { 1, 12, 15, 23, 34, 42, 58, 67, 76, 91 };

    int small = numbers[0];

    int i = 0;
    boolean checker = true;

    while (numbers.length > i) {

      if (numbers[0 + i] > small) {
        checker = true;
        small = numbers[i];

      } else {
        checker = false;
      }
      i++;
    }
    if (checker) {
      System.out.println("YES ARRAY IS SORTED !");
    } else {
      System.out.println("NO ARRAY IS NOT SORTED !");
    }
  }
}
