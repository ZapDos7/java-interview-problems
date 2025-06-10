package binary.xorFinder;

// Given two integers, find their XOR without using the XOR operator.
// (x | y) - (x & y) is equivalent to x ^ y
// XOR sets the bits in either num
// then unsets the ones both have

// e.g. 01000001 XOR 01010000 :
// set all: 01010001
//           ^ ^   ^
//    (S1, S2) S1   S2
// now unset common aka leftmost set: 00010001

import utils.InputReader;

public class FindXORWithoutXOR {
    public static void main(String[] args) {
        System.out.println("Number 1: ");
        int x1 = InputReader.readInt();
        System.out.println("Number 2: ");
        int x2 = InputReader.readInt();
        System.out.println("N1 in binary: " + Integer.toBinaryString(x1));
        System.out.println("N2 in binary: " + Integer.toBinaryString(x2));
        System.out.println("XOR: " + Integer.toBinaryString(xor(x1, x2)));
    }

    private static int xor(int x, int y) {
        return (x | y) - (x & y);
    }
}
