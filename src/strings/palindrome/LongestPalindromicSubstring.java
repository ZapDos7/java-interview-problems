package strings.palindrome;

import utils.InputReader;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.print("Input: ");
        String s = InputReader.readLine();
        System.out.println(longestPalindrome(s.toLowerCase().replaceAll("[^A-Za-z0-9]", "")));
    }

    private static String longestPalindrome(String s) {
        // edge case
        if (s == null || s.isEmpty()) {
            return "";
        }
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Expand for odd-length palindrome
            int len1 = expandAroundCenter(s, i, i);
            // Expand for even-length palindrome
            int len2 = expandAroundCenter(s, i, i + 1);

            int len = Math.max(len1, len2);
            if (len > (end - start)) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    // starting from the middle, we expand one "layer" outside
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // length of palindrome
    }
}
