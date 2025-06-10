package binary.absoluteCalculator;

import utils.InputReader;

// Given an integer, compute its absolute value (abs) without branching.
public class AbsolutNumCalculator {

    public static void main(String[] args) {
        System.out.println("Provide input number: ");
        int input = InputReader.readInt();
        System.out.println("No  branching: " + absoluteNoBranch(input));
        System.out.println("Yes branching: " + absoluteYesBranch(input));
    }

    private static int absoluteNoBranch(int x) {
        final int mask = x >> 31; // correct for 32-bit int
        return ((x + mask) ^ mask);
        // Explanation:
        // mask = x >> 31 gives:
        //      0 if x ≥ 0
        //      -1 (all 1s) if x < 0 (in two's complement)
        // Then:
        //      x + mask subtracts 1 from x if mask == -1
        //      XOR with mask flips bits if mask == -1
        // Equivalent to x >= 0 ? x : -x
    }

    private static int absoluteYesBranch(int n) {
        return ((n >> 31) & 1) == 1 ? -n : n; // ((n >> 31) & 1) ? (~n + 1) : n;
        // Explanation:
        // 1. shift 31 bits: keep sign bit (leftmost)
        // that's 0 for even nums and 1 for odd ones
        // 2. masking with 1
        // (0 for positives, 1s from two's complement for negatives)
        // 3. AND 1 to extract the least significant bit
        // If n >= 0, (n >> 31) is 0, so (n >> 31) & 1 = 0.
        // If n < 0, (n >> 31) is -1 (binary 111...111), so (n >> 31) & 1 = 1.
    }
}
