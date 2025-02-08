
    
    import java.util.Arrays;

    public class SmallestPositiveInteger50 {
    
    public static long findSmallestPositive(long[] arr) {
        Arrays.sort(arr); // Sort the array in non-decreasing order
        long res = 1; // Initialize the result as 1 (smallest possible answer)

        for (int i = 0; i < arr.length && arr[i] <= res; i++) {
            // If arr[i] is greater than 'res', we found the gap
            if (arr[i] > res) {
                break;
            }
            // Otherwise, increment 'res' by arr[i]
            res += arr[i];
        }

        return res;
    }

    public static void main(String[] args) {
        long[] arr = {1, 1, 3, 6, 10, 11, 15};
        System.out.println("Smallest positive integer: " + findSmallestPositive(arr));
    }
}
