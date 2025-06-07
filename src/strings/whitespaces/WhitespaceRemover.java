package strings.whitespaces;

import utils.InputReader;

public class WhitespaceRemover {
    public static void main(String[] args){
        System.out.println("Input: ");
        String string = InputReader.readLine();

        // remove all whitespace
        System.out.println(removeAllWhitespace(string));

        // remove all leading & trailing whitespace only
        System.out.println(removeAllLeadingTrailingWhitespace(string));
    }

    private static String removeAllWhitespace(String string) {
        return string.replaceAll("\\s+", "");
    }

    private static String removeAllLeadingTrailingWhitespace(String string) {
        return string.trim(); // strip also works - uses Unicode code points, so more secure
    }
}
