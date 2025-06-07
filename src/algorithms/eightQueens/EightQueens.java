package algorithms.eightQueens;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EightQueens {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> input = new ArrayList<>();

    System.out.println("Enter the columns of 8 queens (space-separated, values from 1 to 8):");

    for (int i = 0; i < 8; i++) {
      if (scanner.hasNextInt()) {
        int value = scanner.nextInt();
        if (value < 1 || value > 8) {
          System.err.println("Each value must be between 1 and 8.");
          return;
        }
        input.add(value);
      } else {
        System.err.println("Invalid input. Please enter integers only.");
        return;
      }
    }

    if (isValidConfiguration(input)) {
      System.out.println("Valid configuration.");
    } else {
      System.out.println("Invalid configuration.");
    }
  }

  private static boolean isValidConfiguration(List<Integer> cols) {
    for (int i = 0; i < 8; i++) {
      for (int j = i + 1; j < 8; j++) {
        int colI = cols.get(i) - 1; // Convert to 0-based index
        int colJ = cols.get(j) - 1;

        // Same column check
        if (colI == colJ) return false;

        // Diagonal check
        if (Math.abs(colI - colJ) == Math.abs(i - j)) return false;
        // Two queens are on the same diagonal if the difference in their rows equals the difference in their columns.
      }
    }
    return true;
  }
}
