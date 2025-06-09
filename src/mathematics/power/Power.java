package mathematics.power;

import utils.InputReader;

// Implement pow(x, n), which calculates x raised to the power n
public class Power {
    public static void main(String[] args) {
        System.out.print("Input x: ");
        int x = InputReader.readInt();

        System.out.print("Raised to: ");
        int n = InputReader.readInt();

        System.out.println("Result: " + myPow(x, n));
    }

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;  // x^0 = 1
        }
        long absN = Math.abs((long) n);  // use long to handle Integer.MIN_VALUE
        double result = x;

        for (int i = 1; i < absN; i++) {
            result *= x;
        }

        if (n < 0) {
            return 1/result;
        } else {
            return result;
        }
    }
}
