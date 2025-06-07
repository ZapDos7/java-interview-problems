package strings.whitespaces;

import utils.InputReader;

public class WhitespaceRemover {
    public static void main(String[] args){
        System.out.println("Input: ");
        String string = InputReader.readLine();

        // remove all whitespace
        System.out.println(removeAllWhitespace(string));
    }

    private static String removeAllWhitespace(String string) {
        return string.replaceAll("\\s+", "");
    }
}
