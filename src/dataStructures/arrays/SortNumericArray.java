package dataStructures.arrays;

import java.util.Arrays;

public class SortNumericArray {
    public static void main(String[] args){
        int[] array = {1,7,2,6,8,3,4,5};
        System.out.println(Arrays.toString(Arrays.stream(array).sorted().toArray()));
    }
}
