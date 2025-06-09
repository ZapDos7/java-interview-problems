package algorithms.sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] input = { 70, 50, 30, 10, 20, 40, 60 };
        System.out.print("Initial: ");
        for (int val : input) {
            System.out.print(val + " ");
        }
        int[] merged = mergeSort(input, 0, input.length - 1);
        System.out.print("\nMerged & sorted: ");
        for (int val : merged) {
            System.out.print(val + " ");
        }
    }

    private static int[] mergeSort(int[] arr, int lo, int hi) {
        if (lo == hi) { // 1 item
            int[] br = new int[1];
            br[0] = arr[lo];

            return br;
        }
        int mid = (lo + hi) / 2; // else, find middle

        int[] fh = mergeSort(arr, lo, mid); // first half
        int[] sh = mergeSort(arr, mid + 1, hi); // second half

        return merge(fh, sh);
    }

    private static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length) {
            result[k++] = a[i++];
        }

        while (j < b.length) {
            result[k++] = b[j++];
        }

        return result;
    }
}
