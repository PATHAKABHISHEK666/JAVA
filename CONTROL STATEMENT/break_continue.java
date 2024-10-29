public class break_continue {
  public static void main(String[] args) {
    // System.out.println("Before Loop");
    // for (int i = 1; i < 150; i++) {
    // if (i == 11) {
    // break;
    // }
    // System.out.println(i);
    // }
    // System.out.println("Out of Loop!");

    System.out.println("Before Loop");
    for (int i = 1; i < 10; i++) {
      if (i == 7) {
        continue;
      }
      System.out.println(i);
    }
    System.out.println("Out of Loop!");
  }

}
