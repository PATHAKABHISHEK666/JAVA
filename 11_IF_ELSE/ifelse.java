public class ifelse {

  public static void main(String[] args) {
    boolean isMale = false;
    String name = "BOBBY";

    if (isMale) {
      System.out.println("Mr. " + name);
    } else {
      System.out.println("Ms. " + name);
    }
    System.out.println("COMPLETED IF ELSE");

    boolean isSeniorCitizen = false;
    boolean isAnAdult = true;

    if (isSeniorCitizen) {
      System.out.println("HEllo Senior Citizen");
    } else if (isAnAdult) {
      System.out.println("Hello Adult");
    } else {
      System.out.println("Hello Child");
    }
  }
}