public class maths {
  public static void main(String[] args) {
    System.out.println(Math.abs(-99));
    System.out.println(Math.ceil(5.07));
    System.out.println(Math.floor(5.07));
    System.out.println(Math.round(5.07));

    for (int i = 0; i < 10; i++) {
      double random = (int) Math.round(Math.random() * 100);
      System.out.println(random);

    }

  }
}