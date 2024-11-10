import java.util.Scanner;

public class Circle {

  double radiusInMm;

  // Constructor
  public Circle(double radiusInMm) {
    this.radiusInMm = radiusInMm;
  }

  // Method to calculate circumference
  double getCircumference() {
    return 2 * radiusInMm * Math.PI;
  }

  // Method to calculate area
  double getArea() {
    return Math.pow(radiusInMm, 2) * Math.PI;
  }

  @Override
  public String toString() {
    return "Circle Properties:\nRadius (mm): " + radiusInMm +
        "\nCircumference (mm): " + getCircumference() +
        "\nArea (mm^2): " + getArea();
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the world of Circle\n");
    System.out.print("Please Enter Your Radius in mm: ");
    double radius = input.nextDouble();
    Circle circle = new Circle(radius);

    System.out.println(circle);
  }
}
