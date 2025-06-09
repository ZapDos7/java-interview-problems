package dataStructures.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayShuffler {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original: " + Arrays.toString(array));
        System.out.println("Shuffled: " + Arrays.toString(shuffle(array)));
    }

    private static int[] shuffle(int[] array) {
        Random rand = new Random();

        for (int i = array.length - 1; i > 0; i--) { // start from the left
            int j = rand.nextInt(i + 1); // random index from 0 to i
            // swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
}
