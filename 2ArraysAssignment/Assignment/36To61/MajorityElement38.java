
import java.util.HashMap;
import java.util.Map;

public class MajorityElement38 {
    public static int findMajority(int[] arr) {
        
        int n = arr.length;
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count the frequency of each element
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Check if any element has count greater than n/2
        for (int num : arr) {
            if (countMap.get(num) > n / 2) {
                return num; // Found the majority element
            }
        }

        return -1; // No majority element
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 1, 5, 3, 1, 1, 1};
        int majorityElement = findMajority(arr);

        if (majorityElement != -1) {
            System.out.println("Majority element is: " + majorityElement);
        } else {
            System.out.println("No majority element found.");
        }
    }
}

/*
D:\8Assignment\2ArraysAssignment\Assignment\36To61>java MajorityElement38
Majority element is: 1
 */

    

