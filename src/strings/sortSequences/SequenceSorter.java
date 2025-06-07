package strings.sortSequences;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SequenceSorter {
    public static void main(String[] args) {
        List<String> seq1 = List.of("apple", "banana", "pear");
        List<String> seq2 = List.of("grape", "banana", "apple");
        // expected outcome: ["apple", "banana", "grape", "pear"]
        System.out.println(sort(seq1, seq2));
    }

    private static List<String> sort(List<String> seq1, List<String> seq2) {
        // combine, remove duplicates, sort alphabetically
        Set<String> combined = new HashSet<>(); // combines & removes dupes
        combined.addAll(seq1);
        combined.addAll(seq2);
        return combined.stream().sorted().toList();
    }
}
