package dataStructures.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysComparator {
    public static void main(String[] args) {
        Integer[] a1 = {1,2,3,2,1};
        Integer[] a2 = {1,2,3};
        Integer[] a3 = {1,2,3,4};

        System.out.println("Arrays a1, a2 are " + compareElements(a1, a2));
        System.out.println("Arrays a1, a3 are " + compareElements(a1, a3));
    }

    private static Result compareElements(Object[] a1, Object[] a2) {
        // 1. Keep only one copy per element
        Set<Object> uniqueElements1 = new HashSet<>(Arrays.asList(a1));
        Set<Object> uniqueElements2 = new HashSet<>(Arrays.asList(a2));

        // if size is different, they can't be the same
        if (uniqueElements1.size() != uniqueElements2.size()) {
            return Result.DIFFERENT;
        }

        // else, compare elements. If one doesn't exist in the other,
        for (Object obj : uniqueElements1) {
            if (!uniqueElements2.contains(obj)) {
                return Result.DIFFERENT;
            }
        }

        return Result.SAME;
    }

    private enum Result {
        SAME, DIFFERENT;
    }
}
