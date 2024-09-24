import java.util.Scanner;

public class search {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[][] array = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    System.out.println("Enter The Number TO Search : ");
    int num = scanner.nextInt();

    boolean flag = false;

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (num == array[i][j]) {
          flag = true;
        }

      }
    }

    if (flag) {
      System.out.println("The number is present in Array");
    } else {
      System.out.println("The Number is Not Present in ARRAY");
    }

  }

}
