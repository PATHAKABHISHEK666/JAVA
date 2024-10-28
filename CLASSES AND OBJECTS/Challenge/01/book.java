
class book {
  static int totalBooks;
  String title;
  String author;
  String isbn;
  boolean isBorrowed;
  static {
    totalBooks = 0;
  }

  {
    totalBooks++;
  }

  book(String isbn, String title, String author) {
    this.isbn = isbn;
    this.title = title;
    this.author = author;
  }

  book(String isbn) {
    this(isbn, "Unknown", "Unknown");
  }

  static int getTotalNoOfBooks() {
    return totalBooks;
  }

  void borrowBook() {
    if (isBorrowed) {
      System.out.println("Book is Already Borrowed");
    } else {
      System.out.println("Enjoy " + this.title);
      this.isBorrowed = true;
    }
  }

  void returnBook() {
    if (isBorrowed) {
      this.isBorrowed = false;

      System.out.println("Hope you enjoyed, Please leave review");
    } else {
      System.out.println("This book is already in the library");
    }
  }

  public static void main(String[] args) {

    book designOfThings = new book("1", "Desing", "Author");

    book myBook = new book("2");

    System.out.println(book.getTotalNoOfBooks());

    designOfThings.borrowBook();
    myBook.borrowBook();
    myBook.borrowBook();
    designOfThings.returnBook();
    designOfThings.returnBook();

  }

}
