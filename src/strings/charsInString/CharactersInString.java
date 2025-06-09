package strings.charsInString;

import java.util.HashMap;
import java.util.Map;

public class CharactersInString {
    public static void main(String[] args) {
        String str1 = "abcdABCDabcd";
        System.out.println("Chars: " + chars(str1));
    }

    // Return a map with key: char & value: count
    private static Map<Character, Integer> chars(String s) {
        Map<Character, Integer> result = new HashMap<>();
        s.chars() // for each character
                .mapToObj(c -> (char) c)
                .forEach(c -> result.merge(c, 1, Integer::sum)); // count how many occurrences, add to Map
        return result;
    }
}
