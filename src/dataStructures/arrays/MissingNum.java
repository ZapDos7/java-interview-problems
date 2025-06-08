package dataStructures.arrays;

import java.util.*;
import java.util.stream.Collectors;

// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
public class MissingNum {
    public static void main(String[] args){
//        int[] nums = {1,2,4,5,6,0,7,8}; // missing 3
        int[] nums = {1,6,8,3,2,0,4,5}; // missing 7
        var res = missingNumber(nums);
        if (res == null) {
            System.out.print(Arrays.toString(nums) + " is missing no number");
        } else {
            System.out.print(Arrays.toString(nums) + " is missing " + res);
        }
    }

    private static Integer missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return null;
    }
}
