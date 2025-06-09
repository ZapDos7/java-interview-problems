package mathematics.sqrt;

import utils.InputReader;

/*
* Given a non-negative integer x,
* return the square root of x rounded down to the nearest integer.
* The returned integer should be non-negative as well.
* You must not use any built-in exponent function or operator.
* */
public class CustomSquareRoot {
    public static void main(String[] args) {
        System.out.print("Input positive integer to find its square root: ");
        int num = InputReader.readInt();
        System.out.println("Result: " + mySqrt(num));
    }

    // rounded to nearest integer
    private static int mySqrt(int x) {
        // 1 until square exceeds n
        int res = 1;
        while ((long) res * res <= x) { // cast to long to avoid overflow
            res++;
        }

        // return the largest integer whose square <= to n
        return res - 1;
    }
}
