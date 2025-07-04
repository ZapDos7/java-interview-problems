package dataStructures.hashTables;

import java.util.*;

// Sort a HashMap by value
// Since HashMap is unordered, we should use LinkedHashMap
public class Sorter {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("David", 95);
        scores.put("Jane", 80);
        scores.put("Misa", 78);
        scores.put("Mary", 97);
        scores.put("Lisa", 78);
        scores.put("Dino", 65);

        System.out.println(scores);

        scores = sortByValue(scores);

        System.out.println(scores);
    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> scores) {
        LinkedHashMap<String, Integer> sorted = new LinkedHashMap<>();
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(scores.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        for (Map.Entry<String, Integer> entry : entryList) {
            sorted.put(entry.getKey(), entry.getValue());
        }

        return sorted;
    }
}
