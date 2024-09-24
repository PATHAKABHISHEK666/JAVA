public class arrays {

  public static void main(String[] args) {

    // int[] myArr = new int[10];
    // myArr[0] = 9;
    // myArr[1] = 8;
    // myArr[2] = 7;
    // myArr[3] = 6;
    // myArr[4] = 5;

    int[] myArr = { 10, 20, 30, 40, 50 };

    int index = 2;

    // System.out.println(myArr[0]);
    // System.out.println(myArr[1]);
    // System.out.println(myArr[index]);
    // System.out.println(myArr[3]);
    // System.out.println(myArr[4]);

    // Array Traversal ..
    index = 0;

    while (index < myArr.length) {

      System.out.println(myArr[index]);
      index++;

    }

    String[] strArr = new String[4];

    strArr[0] = "My String";

    String[] newStrArr = { "first", "second", "third" };

    System.out.println(newStrArr.length);
  }
}
