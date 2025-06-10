package binary.compareSigns;

import utils.InputReader;

// x ^ y is negative if x and y have opposite signs
public class IntSignsComparator {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        int x = InputReader.readInt();
        System.out.print("Input another number: ");
        int y = InputReader.readInt();

        if ((x ^ y) < 0) {
            System.out.println("They have opposite signs");
        }
        else {
            System.out.println("They have the same sign");
        }
    }
}
