


    import java.util.HashSet;

public class LongestConsecutiveSequence39{
    public static int findLongestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int longestSequence = 0;
        for (int num : arr) {
            if (!set.contains(num - 1)) { // Start of a sequence
                int currentNum = num;
                int currentSequence = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentSequence++;
                }

                longestSequence = Math.max(longestSequence, currentSequence);
            }
        }

        return longestSequence;
    }

    public static void main(String[] args) {
        int[] arr = {49, 1, 3, 200, 2, 4, 70, 5};
        int result = findLongestConsecutive(arr);
        System.out.println("Length of the longest consecutive sequence is: " + result);
    }
}

/*
D:\8Assignment\2ArraysAssignment\Assignment\36To61>java LongestConsecutiveSequence39
Length of the longest consecutive sequence is: 5
 */