
    import java.util.Arrays;

    public class NKoccurs58 {
        public static void findElements(int[] arr, int k) {
            Arrays.sort(arr);
            int n = arr.length;
            int comp = n / k; // Threshold for frequency
    
            for (int i = 0; i < n;) {
                int cnt = 1;
                while (i + 1 < n && arr[i] == arr[i + 1]) {
                    cnt++;
                    i++;
                }
                if (cnt > comp) {
                    System.out.print(arr[i] + " ");
                }
                i++;
            }
        }
    
        public static void main(String[] args) {
            int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
            int k = 4;
            findElements(arr, k);
        }
    }
    /*
    D:\8Assignment\2ArraysAssignment\Assignment\36To61>java NKoccurs58
2 3
     */