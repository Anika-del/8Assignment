public class MaxProductOfThreeNumbers40 {
    public static int maxProduct(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        int result = maxProduct(arr);
        System.out.println("Maximum product of three numbers: " + result);
    }
}
/*
D:\8Assignment\2ArraysAssignment\Assignment\36To61>java MaxProductOfThreeNumbers40
Maximum product of three numbers: 504
 */