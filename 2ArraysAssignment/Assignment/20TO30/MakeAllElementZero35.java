public class MakeAllElementZero35 {
        
            static void moveZeroesToEnd(int[] arr) {
                int n = arr.length;
                int count = 0; // Count of non-zero elements
        
                // Traverse the array and move non-zero elements to the front
                for (int i = 0; i < n; i++) {
                    if (arr[i] != 0) {
                        arr[count++] = arr[i];
                    }
                }
        
                // Fill the remaining positions with zeroes
                while (count < n) {
                    arr[count++] = 0;
                }
            }
        
            public static void main(String[] args) {
                int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
                moveZeroesToEnd(arr);
        
                // Print the modified array
                for (int num : arr) {
                    System.out.print(num + " ");
                }
            }
        }
        
