package binary.rightmostBit;

import utils.InputReader;

// The expression n & (n-1) will turn off the rightmost set bit of a number n
public class Unsetter {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        int x = InputReader.readInt();
        System.out.print("Unsetting the rightmost bit: " + unset(x));
    }

    public static int unset(int x) {
        return x & (x-1);
    }
}
