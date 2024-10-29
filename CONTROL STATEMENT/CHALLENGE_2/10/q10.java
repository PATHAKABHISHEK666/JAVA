
// ! Create a program using recursion  to display the fibonacci series upto a certain number. 

import java.util.Scanner;

class q10 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to printing Fibonacci Series");
    System.out.println("Enter the number of elements to be printed: ");
    int count = input.nextInt();
    for (int i = 1; i <= count; i++) {
      System.out.println(fibonacci(i) + " ");

    }
  }

  public static int fibonacci(int position) {
    if (position == 1) {
      return 0;
    }
    if (position == 2) {
      return 1;
    }
    return fibonacci(position - 1) + fibonacci(position - (1 + 1));
  }
}
