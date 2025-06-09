package strings.palindrome;

import utils.InputReader;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("Input: ");
        String string = InputReader.readLine();
        if (isPalindrome(string)) {
            System.out.println("That's a palindrome");
        } else {
            System.out.println("That's NOT a palindrome");
        }
    }

    private static boolean isPalindrome(String s) {
        s = s.toUpperCase().replaceAll("[^A-Za-z0-9]", "");
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
