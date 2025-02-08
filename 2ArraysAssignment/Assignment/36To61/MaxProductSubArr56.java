public class MaxProductSubArr56 {
    
     public static int maxProduct(int[] arr) {
            int n = arr.length;
            int maxEndingHere = arr[0];
            int minEndingHere = arr[0];
            int maxSoFar = arr[0];
    
            for (int i = 1; i < n; i++) {
                // Update maxEndingHere and minEndingHere
                int temp = maxEndingHere;
                maxEndingHere = Math.max(arr[i], Math.max(arr[i] * maxEndingHere, arr[i] * minEndingHere));
                minEndingHere = Math.min(arr[i], Math.min(arr[i] * temp, arr[i] * minEndingHere));
    
                // Update maxSoFar
                maxSoFar = Math.max(maxSoFar, maxEndingHere);
            }
    
            return maxSoFar;
        }
    
        public static void main(String[] args) {
            int[] array = {2, 3, -2, 4};
            int maxProduct = maxProduct(array);
    
            System.out.println("Maximum product of contiguous subarray: " + maxProduct);
        }
    }
    /*
    Maximum product of contiguous subarray: 6
     */