package binary.rightmostBit;

import utils.InputReader;

public class OnlySetBitFinder {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        int x = InputReader.readInt();
        System.out.print("Position of only set bit: " + positionOfSet(x));
    }

    public static int positionOfSet(int n) {
        // unset the rightmost bit and check if the number is non-zero
        if ((n & (n - 1)) != 0)
        {
            System.out.println("Wrong input");
            return 1;
        }
        // If 0, we can find the position of the only set bit by directly using log2(n) + 1.
        return log(n, 2) + 1;
    }

    public static int log(int x, int base) {
        return (int) (Math.log(x) / Math.log(base));
    }
}
