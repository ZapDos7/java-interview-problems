package strings.anagram;

import utils.InputReader;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
    public static void main(String[] args) {
        System.out.print("String 1: ");
        String s1 = InputReader.readLine();
        System.out.print("String 2: ");
        String s2 = InputReader.readLine();
        if (isAnagram(s1.trim().toLowerCase(), s2.trim().toLowerCase())) {
            System.out.print("They're anagrams of each other");
        } else {
            System.out.print("They're NOT anagrams of each other");
        }
    }

    // also work with Unicode characters
    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            var tMap = letterCount(t);
            for (Map.Entry<Character, Integer> entry : letterCount(s).entrySet()) {
                if (!tMap.containsKey(entry.getKey()) || !tMap.get(entry.getKey()).equals(entry.getValue())) {
                    return false;
                }
            }
        }
        return true;
    }

    private static Map<Character, Integer> letterCount(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
