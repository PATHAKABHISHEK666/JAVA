// ! Concatenate and Convert: Take two strings, concatenate them, and convert the result to uppercase

class concat {
  public static void main(String[] args) {
    String firstName = "Abhishek";
    String lastName = "Pathak";

    String fullName = firstName.concat("  ").concat(lastName).toUpperCase();
    System.err.println(fullName);
  }
}
