public class RemoveDuplicate53 {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0; // Empty array
        }

        int uniqueCount = 1; // Initialize with the first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueCount - 1]) {
                // If the current element is different from the last unique element
                arr[uniqueCount] = arr[i]; // Move it to the next unique position
                uniqueCount++; // Increment the unique count
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] A = {1, 1, 2};
        int newLength = removeDuplicates(A);

        System.out.print("New array A: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("\nNew length: " + newLength);
    }
}
/*
D:\8Assignment\2ArraysAssignment\Assignment\36To61>java RemoveDuplicate53
New array A: 1 2
New length: 2
 */