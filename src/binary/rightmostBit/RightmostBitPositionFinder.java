package binary.rightmostBit;

import utils.InputReader;

public class RightmostBitPositionFinder {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        int x = InputReader.readInt();
        //unset the rightmost bit of number & XOR the result with number
        System.out.print("Result: " + positionOfRightmostSetBit(x));
    }

    static int positionOfRightmostSetBit(int n)
    {
        // if the number is odd, return 1
        if ((n & 1) != 0) {
            return 1;
        }

        // unset rightmost bit and xor with the number itself
        n = n ^ (n & (n - 1));

        // find the position of the only set bit in the result;
        // we can directly return `log2(n) + 1` from the function
        int pos = 0;
        while (n != 0)
        {
            n = n >> 1;
            pos++;
        }
        return pos;
    }
}
