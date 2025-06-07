package strings;

import utils.InputReader;

public class StringReverser {
    public static void main(String[] args){
        System.out.println("Input desired string to be reversed: ");
        String input = InputReader.readLine();
        //
        System.out.println(reverse(input));
    }

    private static String reverse(String string) {
        StringBuilder result = new StringBuilder();
        if (string.isEmpty()) {
            return result.toString();
        }
        for(int i = string.length() - 1; i >= 0; i--) {
            result.append(string.charAt(i));
        }
        return result.toString();
    }
}
