package algorithms.search.rabinKarp;

import utils.InputReader;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two strings text and pattern string,
 * your task is to find all starting positions
 * where the pattern appears as a substring within the text.
 * The strings will only contain lowercase English alphabets.
 * While reporting the results, use 1-based indexing
 * (i.e., the first character of the text is at position 1).
 * You are required to identify every occurrence of the pattern,
 * including overlapping ones, if any.
 */
public class RabinKarp {

    private static final int PRIME = 101; // A prime number for hash calculation
    // Larger primes are more stable in large-scale inputs

    public static void main(String[] args) {
        System.out.print("Input lowercase text: ");
        String text = InputReader.readLine();

        System.out.print("Input lowercase search term: ");
        String term = InputReader.readLine();

        var res = search(text, term);
        if (res.isEmpty()) {
            System.out.println("The string \"" + term + "\" does not occur in text.");
        } else {
            for (int i : res) {
                System.out.println("The string \"" + term + "\" occurs at index " + i + 1 + " in text.");
            }
        }
    }

    private static List<Integer> search(String text, String term) {
        List<Integer> result = new ArrayList<>();
        int m = term.length();
        int n = text.length();

        // edge case: if the pattern is longer than the text, no match is possible
        if (m > n) return result;

        // compute the hash of the initial text
        long termHash = createHash(term, m);
        // compute the hash of the first window of text of the same length as term
        long textHash = createHash(text, m);

        for (int i = 0; i <= n - m; i++) { // sliding window
            // if the hashes match, double-check the actual substring to avoid false positives.
            if (termHash == textHash && text.substring(i, i + m).equals(term)) {
                result.add(i);
            }
            if (i < n - m) {
                // roll the hash to the next window
                textHash = recalculateHash(text, i, i + m, textHash, m);
            }
        }
        return result;
    }

    // Calculates hash by giving more weight to later characters (using a small prime base like 101)
    // e.g. "abc": hash = 'a'*101^0 + 'b'*101^1 + 'c'*101^2 = 1 + 101 + 10201 = 10303
    private static long createHash(String str, int length) {
        long hash = 0;
        for (int i = 0; i < length; i++) {
            hash += (long) (str.charAt(i) * Math.pow(PRIME, i));
        }
        return hash;
    }

    // Roll the hash instead of recomputing from
    private static long recalculateHash(String str, int oldIndex, int newIndex, long oldHash, int patternLen) {
        long newHash = oldHash - str.charAt(oldIndex); // remove char at the beginning
        newHash = newHash / PRIME; // shift all weights one place
        newHash += (long) (str.charAt(newIndex) * Math.pow(PRIME, patternLen - 1)); // add new char at the end
        return newHash;
    }
}
