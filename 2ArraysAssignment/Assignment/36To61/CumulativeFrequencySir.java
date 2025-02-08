import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CumulativeFrequencySir {
    public static void countFrequency(int[] arr) {
        // Sort the array
        Arrays.sort(arr);

        // Initialize a map to store the cumulative frequency
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        int cumulativeFreq = 0;
        for (int num : arr) {
            cumulativeFreq++;
            frequencyMap.put(num, cumulativeFreq);
        }

        // Print the cumulative frequency
        for (int num : arr) {
            System.out.println(num + " -> " + frequencyMap.get(num));
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 2, 4};
        countFrequency(arr);

        System.out.println();

        int[] arr1 = {1, 2, 1, 2, 1, 2};
        countFrequency(arr1);
    }
}
/*
D:\8Assignment\2ArraysAssignment\Assignment\36To61>java CumulativeFrequencySir
1 -> 2
1 -> 2
2 -> 4
2 -> 4
3 -> 5
4 -> 6

1 -> 3
1 -> 3
1 -> 3
2 -> 6
2 -> 6
2 -> 6
 */
