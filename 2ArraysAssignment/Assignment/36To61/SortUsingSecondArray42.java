import java.util.Arrays;
import java.util.Comparator;

public class SortUsingSecondArray42 {
    public static void main(String[] args) {
        String[] array1 = {"a", "b", "c", "d", "e", "f", "g", "h"};
        int[] array2 = {0, 1, 1, 0, 1, 2, 2, 0, 1};
        // Create a custom comparator based on the positions in array2
        Comparator<String> customComparator = (s1, s2) -> Integer.compare(array2[s1.charAt(0) - 'a'], array2[s2.charAt(0) - 'a']);
        // Sort array1 using the custom comparator
        Arrays.sort(array1, customComparator);
        // Print the sorted array1
        System.out.println("Sorted array1: " + Arrays.toString(array1));

        System.out.println();

        // String[] array3 = {"g", "e", "e", "k", "s", "f", "o", "r", "g", "e", "e", "k", "s"};
        // int[] array4 = {0, 1, 1, 0, 1, 2, 2, 0, 1};
        // // Create a custom comparator based on the positions in array4
        // Comparator<String> customComparator1 = (s1, s2) -> Integer.compare(array4[s1.charAt(0) - 'a'], array4[s2.charAt(0) - 'a']);
        // // Sort array3 using the custom comparator
        // Arrays.sort(array3, customComparator1);
        // // Print the sorted array3
        // System.out.println("Sorted array3: " + Arrays.toString(array3));
    }
}
/*
D:\8Assignment\2ArraysAssignment\Assignment\36To61>java SortUsingSecondArray42
Sorted array1: [a, d, h, b, c, e, f, g]
 */