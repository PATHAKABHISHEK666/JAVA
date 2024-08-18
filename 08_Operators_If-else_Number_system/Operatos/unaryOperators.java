public class unaryOperators {

  public static void main(String[] args) {

    int x = 5;
    int y = -x;
    int z = -y;

    System.out.println(z);

    int a = 8;
    System.out.println(a);
    a++;
    System.out.println(a);
    ++a;
    System.out.println(a);
    a += 1;
    System.out.println(a);
    System.out.println("_________");

    int p = 12;
    System.out.println(p++);
    System.out.println(p);
    System.out.println(++p);
    System.out.println(p);

    System.out.println("_______________");

    System.out.println(--p);
    System.out.println(p);
    System.out.println(p--);
    System.out.println(p);

  }
}