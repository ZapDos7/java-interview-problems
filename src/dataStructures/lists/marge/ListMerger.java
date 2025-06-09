package dataStructures.lists.marge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListMerger {
    public static void main(String[] args) {
        List<String> l1 = List.of("apple", "pear", "watermelon");
        List<String> l2 = List.of("banana", "pineapple", "apple", "fig");

        // Just merge
        List<String> togetherList = new ArrayList<>(l1);
        togetherList.addAll(l2);

        System.out.println("Merged:          " + togetherList);

        // Merge but omit duplicates
        Set<String> togetherSet = new HashSet<>(togetherList);

        System.out.println("Merged & fixed:  " + togetherSet);

        // Merge, omit dupes, sort
        System.out.println("Merged & sorted: " + togetherSet.stream().sorted().toList());
    }
}
