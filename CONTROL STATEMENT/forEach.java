public class forEach {
  public static void main(String[] args) {
    String[] array = new String[] { "RAM", "SHYAM", "ROHAN", "SITA", "GEETA", "BABITA" };
    // printarr(array);
    printArrForEach(array);
  }

  public static void printarr(String[] array) {

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

  }

  public static void printArrForEach(String[] array) {

    for (String name : array) {
      System.out.println(name);
    }

  }
}
