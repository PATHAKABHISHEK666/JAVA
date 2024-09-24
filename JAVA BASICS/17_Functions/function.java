
public class function {

  public static void main(String[] args) {

    printFirstPattern();
    // printSecondPattern();
    // printThirdPattern();

  }

  public static void printFirstPattern() {

    int rows = 0;
    while (rows < 5) {
      System.out.print("*");
      int i = 0;
      while (i < rows) {
        System.out.print(" *");
        i++;
      }
      System.out.println();
      rows++;
    }

  }

  public static void printSecondPattern() {
    System.out.println("* * * * * *");
    System.out.println("* * * * *");
    System.out.println("* * * *");
    System.out.println("* * *");
    System.out.println("* *");
    System.out.println("*");

  }

  public static void printThirdPattern() {

    System.out.println("          *");
    System.out.println("        * *");
    System.out.println("      * * *");
    System.out.println("    * * * *");
    System.out.println("  * * * * *");
    System.out.println("* * * * * *");

  }

  public static void greetUSer() {

    System.out.println("Good Morning This is Method");

  }

}
