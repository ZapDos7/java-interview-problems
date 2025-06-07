package binary.binToDecimal;

import utils.InputReader;

public class BinToDecConverter {
    public static void main(String[] args) {
        System.out.println("Provide input number in binary form: ");
        String input = InputReader.readLine();
        if (input.matches("^[01]+$")) {
            System.out.println(toDecimal(input));
        }
        else {
            System.out.println("Invalid input");
        }
    }

    // The decimal equivalent is calculated by Bn * 2n+ Bn-1 * 2n-1 + … + B1 * 2 + B0.
    private static int toDecimal(String in) {
        int result = 0;
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == '1') {
                result += (int) Math.pow(2, i);
            }
        }
        return result;
    }
}
