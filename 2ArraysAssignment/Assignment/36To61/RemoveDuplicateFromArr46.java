
public class RemoveDuplicateFromArr46 {
    
    
        public static int removeDuplicates(int[] arr, int n) {
            if (n == 0 || n == 1) {
                return n;
            }
    
            int[] temp = new int[n];
            int j = 0;
    
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    temp[j++] = arr[i];
                }
            }
    
            temp[j++] = arr[n - 1];
    
            for (int i = 0; i < j; i++) {
                arr[i] = temp[i];
            }
    
            return j;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 1, 2, 2, 2};
            int n = arr.length;
    
            n = removeDuplicates(arr, n);
    
            System.out.print("Array after removing duplicates: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    
    /*
     D:\8Assignment\2ArraysAssignment\Assignment\36To61>java RemoveDuplicateFromArr46
Array after removing duplicates: 1 2
     */
