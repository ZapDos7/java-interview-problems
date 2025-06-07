package dataStructures.lists.oddNumChecker;

import java.util.List;

public class OddNumbersInList {
    public static void main(String[] args){
        // List<Integer> numbers = List.of(48,12,52,13);
        List<Integer> numbers = List.of(48,12,52);
        if (hasOddNums(numbers)) {
            System.out.println("List contains odd numbers");
        } else {
            System.out.println("List contains no odd numbers");
        }
    }

    private static boolean hasOddNums(List<Integer> list) {
        return list.stream().filter(i -> i % 2 == 0).count() != list.size();
    }
}
