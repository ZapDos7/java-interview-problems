package binary.binCheckOddOrEven;

import utils.InputReader;

// The expression n & 1 returns value 1 or 0 depending upon whether n is odd or even.
public class BinaryCheckOddEvenNum {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        int n = InputReader.readInt();
        if ((n & 1) != 0) {
            System.out.println(n + " is odd");
        }
        else {
            System.out.println(n + " is even");
        }
    }
}
