import java.util.Scanner;

public class perimeterofRectangle {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter values of Width and Length : \n");

    System.out.print("Width:  ");
    float Width = scanner.nextFloat();
    System.out.print("Length :  ");
    float Length = scanner.nextFloat();

    float perimeterofRectangle = 2 * (Length + Width);

    System.out.println(perimeterofRectangle);

    scanner.close();
  }
}