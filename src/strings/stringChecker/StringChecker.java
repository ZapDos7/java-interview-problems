package strings.stringChecker;

import utils.InputReader;

public class StringChecker {
    public static void main(String[] args) {
        String input = InputReader.readLine();
        if (isValidIdentifier(input)) {
            System.out.println(input + " is a valid identifier");
        } else {
            System.out.println(input + " is NOT a valid identifier");
        }

        if (isValidPassword(input)) {
            System.out.println(input + " is a valid password");
        } else {
            System.out.println(input + " is NOT a valid password");
        }
    }

    //An identifier in Java, C++ and most other programming languages must begin with a letter
    // and then may be followed by any number of letters or digits.
    // It is possible that underscores (_) will also appear, but only in the middle and never two consecutively.
    //Write a program to read a string and output whether it is a valid or invalid identifier.
    // Each string will be <= 10 characters in size.
    private static boolean isValidIdentifier(String input) {
        return (input.length() <= 10 && input.matches("^[A-Za-z](?!.*__)[A-Za-z0-9_]{0,9}$") && !input.endsWith("_"));
        //Explanation:
        //^ → start of string
        //[A-Za-z] → first character must be a letter
        //(?!.*__) → negative lookahead to reject double underscores
        //[A-Za-z0-9_]{0,9} → remaining 0–9 characters can be letters, digits, or underscores
        //$ → end of string
        //Total length is at most 10 characters: 1 letter (first char) + up to 9 more = 10 total.
    }

    // Write a program that will validate a password. Password must have,
    // 1) 8 to 12 characters
    // 2) at least one numeric digit
    // 3) at least one alphabet
    // 4) must not have space or slash (/)
    // 5) at least one Capital letter
    // 6) starting character must not be a number
    private static boolean isValidPassword(String password) {
        // Check length: 8 to 12 characters
        if (password.length() < 8 || password.length() > 12) {
            return false;
        }

        // Check first character is not a digit
        if (Character.isDigit(password.charAt(0))) {
            return false;
        }

        // Check it does not contain space or slash
        if (password.contains(" ") || password.contains("/")) {
            return false;
        }

        // Check for at least one digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // Check for at least one alphabet
        if (!password.matches(".*[A-Za-z].*")) {
            return false;
        }

        // Check for at least one capital letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // All checks passed
        return true;
    }
}
