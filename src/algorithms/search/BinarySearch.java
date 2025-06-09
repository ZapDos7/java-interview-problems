package algorithms.search;

/* The array elements must be sorted to implement binary search.
   The binary search algorithm is based on the following conditions:
     1. If the key is less than the middle element, then you now need to search only in the first half of the array.
     2. If the key is greater than the middle element, then you need to search only in the second half of the array.
     3. If the key is equal to the middle element in the array, then the search ends.
     4. Finally, if the key is not found in the whole array, then it should return -1. This indicates that the element is not present.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;

        int result = binarySearch(arr, x);
        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result); // 3
        }
    }

    private static int binarySearch(int arr[], int x) {
        return binarySearch(arr, 0, arr.length - 1, x);
    }

    private static int binarySearch(int arr[], int low, int high, int x) {
        if (low > high) {
            System.out.println(x + " does not exist in array");
            return -1;  // base case: not found
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == x) {
            System.out.println("Found!");
            return mid;
        } else if (arr[mid] > x) { // we need to go lower
            return binarySearch(arr, low, mid - 1, x); // exclude mid
        } else { //if (arr[mid] < x) { // we need to go higher
            return binarySearch(arr, mid + 1, high, x); // exclude mid
        }
    }
}
