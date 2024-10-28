import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("WELCOME TO DAY OF WEEK DETECTOR\n");

    System.out.println("Enter your day in number: ");

    int day = input.nextInt();

    // olsSwitch(day)

    newSwitch(day);

  }

  public static void oldSwitch(int day) {

    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Invalid Day");
        break;
    }
  }

  public static void newSwitch(int day) {

    String dayStr = switch (day) {
      case 1 -> "MONDAY";
      case 2 -> "TUESDAY";
      case 3 -> "WEDNESDAY";
      case 4 -> "THURSDAY";
      case 5 -> "FRIDAY";
      case 6 -> "SATURDAY";
      case 7 -> "SUNDAY";
      default -> "Invalid";
    };
    System.out.println(dayStr);

  }
}
