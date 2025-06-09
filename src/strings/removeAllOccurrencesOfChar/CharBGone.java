package strings.removeAllOccurrencesOfChar;

import utils.InputReader;

public class CharBGone {
    public static void main(String[] args) {
        System.out.print("Type desired string: ");
        String input = InputReader.readLine();
        System.out.print("Type character to be eradicated: ");
        char c = InputReader.readChar();
        System.out.print(input + " without " + c + " is " + input.replaceAll(String.valueOf(c), ""));
    }
}
