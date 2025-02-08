public class FrequencyCount20 {
        //Question 
        //void frequencycount(int x[])
    public static void countFreq(int arr[], int n) {
        // Create a boolean array to keep track of visited elements
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue; // Skip if already processed
            }
            
            int count = 1; // Initialize frequency count
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true; // Mark as visited
                    count++;
                }
            }
            
            System.out.println(arr[i] + " " + count);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        countFreq(arr, n);
    }
}
