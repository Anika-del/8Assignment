public class NonRepeatingNumber41 {
    public static int findNonRepeating(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {23, 34, 56, 21, 21, 58, 78, 23, 34};
        int nonRepeatingNumber = findNonRepeating(arr);
        System.out.println("The non-repeating number is: " + nonRepeatingNumber);
    }
}
