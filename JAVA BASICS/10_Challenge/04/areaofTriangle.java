import java.util.Scanner;

public class areaofTriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input the base of the triangle
    System.out.print("Enter the base of the triangle: ");
    float base = scanner.nextFloat();

    // Input the height of the triangle
    System.out.print("Enter the height of the triangle: ");
    float height = scanner.nextFloat();

    // Calculate the area of the triangle
    float area = 0.5f * base * height;

    // Output the area of the triangle
    System.out.println("The area of the triangle is: " + area);

    scanner.close();
  }
}
