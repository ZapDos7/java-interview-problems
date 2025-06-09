package dataStructures.arrays;

import java.util.Arrays;

public class SecondLargestNumFinder {
    public static void main(String[] args) {
        int[] array = {4,3,6,9,22,21,1,5,2};
        System.out.println("Second largest number in array " + Arrays.toString(array) + " is " + num(array));
    }
    private static int num(int[] array) {
        return Arrays.stream(array).boxed().sorted().toList().get(array.length - 2); // length - 1 would be largest
    }
}
