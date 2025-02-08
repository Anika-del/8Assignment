
    
    import java.util.HashSet;

    public class SumEqualtoZero52 {
        public static boolean hasZeroSumSubarray(int[] arr) {
            HashSet<Integer> prefixSums = new HashSet<>();
            int sum = 0;
    
            for (int num : arr) {
                sum += num;
    
                // If the current sum is zero or has been seen before, return true
                if (sum == 0 || prefixSums.contains(sum)) {
                    return true;
                }
    
                // Add the current prefix sum to the set
                prefixSums.add(sum);
            }
    
            // No such subarray found, return false
            return false;
        }
    
        public static void main(String[] args) {
            int[] arr = {4, 2, -3, 1, 6};
            if (hasZeroSumSubarray(arr)) {
                System.out.println("Found a subarray with zero sum.");
            } else {
                System.out.println("No such subarray exists.");
            }
        }
    }
    
/*
D:\8Assignment\2ArraysAssignment\Assignment\36To61>java SumEqualtoZero52
Found a subarray with zero sum.
 */