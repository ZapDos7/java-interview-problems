package dataStructures.arrays;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,4};
        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.stream(productExceptSelf(nums)).boxed().toList());
    }

    // Brute force: O(n^2)
    private static int[] productExceptSelf(int[] nums) {
        int[] prefixes = new int[nums.length];
        int[] suffixes = new int[nums.length];
        int[] answer = new int[nums.length];

        // Compute prefix products and store them in answer[].
        prefixes[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefixes[i] = prefixes[i - 1] * nums[i - 1];
        }

        // Traverse from the end to accumulate suffix products and update answer[] with the result.
        suffixes[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            suffixes[i] = suffixes[i + 1] * nums[i + 1];
        }

        // final products
        for (int i = 0; i < nums.length; i++) {
            answer[i] = prefixes[i] * suffixes[i];
        }

        return answer;
    }
}
