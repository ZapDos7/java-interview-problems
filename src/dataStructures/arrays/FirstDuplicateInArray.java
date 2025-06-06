package dataStructures.arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 2, 3, 5, 1};
        Integer result = findFirstDuplicate(arr);
        if (result != null) {
            System.out.println("First duplicate: " + result);
        } else {
            System.out.println("No duplicates found.");
        }
    }

//    Time: O(n)
//    Space: O(n)
    private static Integer findFirstDuplicate(int[] array) {
        Set<Integer> seen = new HashSet<>();
        for (int x : array) {
            if (!seen.contains(x)) {
                seen.add(x);
            } else {
                return x;
            }
        }
        return null;
    }
}
