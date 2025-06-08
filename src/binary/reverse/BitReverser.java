package binary.reverse;

import binary.binToDecimal.BinToDecConverter;

// Reverse bits of a given 32 bits unsigned integer.
public class BitReverser {
      public static void main(String[] args) {
            String inputAsBits = "00000010100101000001111010011100";
            long nLong = Long.parseLong(inputAsBits, 2);
            int n = (int) (nLong & 0xFFFFFFFFL);

            var result = reverseBits(n);
            System.out.println(
                "The input binary string "
                    + inputAsBits
                    + " represents the unsigned integer "
                    + BinToDecConverter.toDecimal(inputAsBits)
                    + ", so return "
                    + result
                    + " which its binary representation is "
                    + String.format("%32s", Integer.toBinaryString(result)).replace(' ', '0') + ".");
      }

      public static int reverseBits(int n) {
            int result = 0;
            for (int i = 0; i < 32; i++) {
                  result <<= 1;
                  result |= (n & 1);
                  n >>= 1;
            }
            return result;
      }
}
