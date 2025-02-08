import java.util.Arrays;

public class NegativePositive51 {
   
   public static void rearrangeArray(int[] arr) {
        int n = arr.length;
        int outOfPlace = -1;

        for (int i = 0; i < n; i++) {
            if (outOfPlace == -1) {
                // Check if the current index is out of place
                if ((i % 2 == 0 && arr[i] >= 0) || (i % 2 != 0 && arr[i] < 0)) {
                    outOfPlace = i;
                }
            } else {
                // Search for the next index with an opposite sign
                if ((arr[outOfPlace] >= 0 && arr[i] < 0) || (arr[outOfPlace] < 0 && arr[i] >= 0)) {
                    // Right rotate the subarray between outOfPlace and i
                    int temp = arr[i];
                    for (int j = i; j > outOfPlace; j--) {
                        arr[j] = arr[j - 1];
                    }
                    arr[outOfPlace] = temp;
                    outOfPlace = -1; // Reset outOfPlace
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, -4, -1, 4};
        rearrangeArray(arr1);
        System.out.println("Output for arr1: " + Arrays.toString(arr1));

        int[] arr2 = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        rearrangeArray(arr2);
        System.out.println("Output for arr2: " + Arrays.toString(arr2));
    }
}
/*
D:\8Assignment\2ArraysAssignment\Assignment\36To61>java AlternatePositiveNegative
Output for arr1: [-4, 1, 2, 3, -1, 4]
Output for arr2: [-5, 5, -2, 2, -8, 4, 7, 1, 8, 0]
 */

