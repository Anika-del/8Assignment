//KthSmallestUsingBinarySearch

import java.util.Arrays;
import java.util.Vector;

public class KthSmallestElem36
 {
    public static int count(Vector<Integer> nums, int mid) {
        int cnt = 0;
        for (int num : nums) {
            if (num <= mid) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int kthSmallest(Vector<Integer> nums, int k) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int num : nums) {
            low = Math.min(low, num);
            high = Math.max(high, num);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = count(nums, mid);

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>(Arrays.asList(7, 10, 4, 20, 15));
        int k = 2; // Find the 4th smallest element
        System.out.println("K'th smallest element is " + kthSmallest(nums, k));

        Vector<Integer> nums1 = new Vector<>(Arrays.asList(7, 10, 4, 20, 15));
        int k1 = 3; // Find the 4th smallest element
        System.out.println("K'th smallest element is " + kthSmallest(nums1, k1));

        Vector<Integer> num = new Vector<>(Arrays.asList(7, 10, 4, 20, 15));
        int k2 = 4; // Find the 4th smallest element
        System.out.println("K'th smallest element is " + kthSmallest(num, k2));
    }
}
/*
D:\8Assignment\2ArraysAssignment\Assignment\36To61>java KthSmallestElem36
K'th smallest element is 7
K'th smallest element is 10
K'th smallest element is 15
 */