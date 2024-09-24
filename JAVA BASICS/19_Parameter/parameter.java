
public class parameter {

  public static void main(String[] args) {

    System.out.println("The Sum Of Numbers: " + sum(12, 22) + "\n");

    System.out.println("The Sum Of Numbers: " + sum(10, 20) + "\n");

    System.out.println("The Sum Of Numbers: " + sum(21, 21) + "\n");

  }

  public static int sum(int first, int second) {
    System.out.println("First Number Received : " + first);
    System.out.println("Second Number Received : " + second);
    return first + second;
  }

}
