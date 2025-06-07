package strings.diamondPrinter;

import utils.InputReader;

public class DiamondPrinter {
  public static void main(String[] args) {
    int num;
    System.out.println("Enter an odd number (1-100): ");
    try {
      num = Integer.parseInt(InputReader.readLine());
    } catch (Exception e) {
      System.err.println("Invalid input - must be an odd integer.");
      return;
    }
    print(num);
  }

  private static void print(int oddNumber) {

    int length = oddNumber / 2;

    for (int i = 0; i <= length; i++) {
      for (int j = length - i - 1; j >= 0; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k < 2 * (i + 1); k++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }

    for (int i = 0; i < length; i++) {
      for (int j = 1; j <= i + 1; j++) {
        System.out.print(" ");
      }
      oddNumber -= 2;
      for (int k = oddNumber; k >= 1; k--) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
