package strings.stringContainsCharacter;

import utils.InputReader;

public class VowelChecker {
    public static void main(String[] args){
        System.out.print("Input desired string to be checked: ");
        String input = InputReader.readLine();
        System.out.print("Input desired character: ");
        String character = InputReader.readLine();
        //
        if (check(input, character)) {
            System.out.println("String contains " + character);
        } else {
            System.out.println("String does not contain " + character);
        }

        if (checkForVowels(input)) {
            System.out.println("String contains vowels");
        } else {
            System.out.println("String contains no vowels");
        }
    }

    private static boolean check(String string, String c) {
        return string.contains(c);
    }

    // to check for all vowels, use this:
    private static boolean checkForVowels(String string) {
        return string.toLowerCase().matches(".*[aeiou].*");
    }
}
