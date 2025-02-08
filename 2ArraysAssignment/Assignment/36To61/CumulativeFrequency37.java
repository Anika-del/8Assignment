import java.util.HashMap;
import java.util.Map;

public class CumulativeFrequency37 {
    public static void countFrequency(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int cumulativeFreq = 0;
        for (int num : arr) {
            cumulativeFreq += frequencyMap.get(num);
            System.out.println(num + " -> " + cumulativeFreq);
            frequencyMap.put(num, 0); // Mark the occurrence as 0
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
D:\8Assignment\2ArraysAssignment\Assignment\36To61>java CumulativeFrequency
D:\8Assignment\2ArraysAssignment\Assignment\36To61>java CumulativeFrequency37
1 -> 2
3 -> 3
2 -> 5
1 -> 5
2 -> 5
4 -> 6

1 -> 3
2 -> 6
1 -> 6
2 -> 6
1 -> 6
2 -> 6
 */
