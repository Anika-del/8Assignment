
    
    public class MaxSumSubArr55 {
        public static int maxSubArraySum(int[] arr) {
            int maxSoFar = Integer.MIN_VALUE; // Initialize with minimum value
            int maxEndingHere = 0;
    
            for (int num : arr) {
                maxEndingHere = Math.max(num, maxEndingHere + num);
                maxSoFar = Math.max(maxSoFar, maxEndingHere);
            }
    
            return maxSoFar;
        }
    
        public static void main(String[] args) {
            int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            int maxSum = maxSubArraySum(array);
    
            System.out.println("Maximum sum of contiguous subarray: " + maxSum);
        }
    }
    /*
    Maximum sum of contiguous subarray: 6
     */
