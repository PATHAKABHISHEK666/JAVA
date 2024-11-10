import java.util.Random;

public class diceroll {
  public static void main(String[] args) {
    int min = 1; // Minimum range
    int max = 6; // Maximum range

    Random random = new Random();
    int randomNum = random.nextInt((max - min) + 1) + min;

    System.out.println("Your Number is :  " + randomNum);
  }
}
