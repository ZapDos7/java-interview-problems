package strings.duplicateWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args){
        List<String> inputs = List.of("word", "apple", "test");
        for (String s : inputs) {
            System.out.println(duplicateChars(s));
        }
    }

    private static List<Character> duplicateChars(String string) {
        List<Character> result = new ArrayList<>();
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : string.toCharArray()) {
            charCount.merge(c, 1, Integer::sum);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
