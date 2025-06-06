package searching101;

import utils.InputReader;

import java.util.ArrayList;
import java.util.List;

public class Search {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            input.add(readInput(false));
        }
        int searchNum = readInput(true);
        if (input.contains(searchNum)) { // contains
            System.out.println("The number " + searchNum + " appears in the first 5 numbers.");
        } else { // or not
            System.out.println("The number " + searchNum + " does not appear in the first 5 numbers.");
        }
    }

    private static int readInput(boolean isLastNum) {
        if (!isLastNum) {
            System.out.print("Enter a number: ");
        } else {
            System.out.print("Enter the number to be searched: ");
        }
        return Integer.parseInt(InputReader.read());
    }
}
