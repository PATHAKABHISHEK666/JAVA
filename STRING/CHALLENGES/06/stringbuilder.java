
public class stringbuilder {
  public static void main(String[] args) {

    // Make a word using letters

    // char[] letters = { 'A', 'E', 'R', 'O', 'P', 'L', 'A', 'N', 'E' };

    // StringBuilder sb = new StringBuilder();

    // System.out.println(sb);

    // for (char c : letters) {
    // sb.append(c);
    // }
    // System.out.println(sb);

    // ! Make a string using words

    String[] words = { "Hello", "friends", "This", "is", "Abhishek", "and", "I", "am", "software",
        "Developer" };

    StringBuilder string = new StringBuilder();

    for (String word : words) {
      string.append(" ").append(word);
    }

    System.out.println(string);

  }
}
