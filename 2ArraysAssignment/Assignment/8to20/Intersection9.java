import java.util.Arrays;

public class Intersection9 {
    
       public static int[] intersection(int[] x, int[] y) {
            // Create a new array to store the intersection
            int[] result = new int[Math.min(x.length, y.length)];
            int resultIndex = 0;
        
            // Iterate through the elements of array x
            for (int i = 0; i < x.length; i++) {
                // Check if the current element of x exists in array y
                for (int j = 0; j < y.length; j++) {
                    if (x[i] == y[j]) {
                        // Add the common value to the result array
                        result[resultIndex] = x[i];
                        resultIndex++;
                        break; // No need to continue checking for this element
                    }
                }
            }
        
            // Resize the result array to the actual number of common values
            return Arrays.copyOf(result, resultIndex);
        }
        
        // Example usage:
        public static void main(String[] args) {
            int[] x = {1, 3, 5, 7, 9};
            int[] y = {9, 3, 9, 4};
        
            int[] commonValues = intersection(x, y);
        
            // Print the common values
            System.out.print("Common values: ");
            for (int value : commonValues) {
                System.out.print(value + " ");
            }
        }
    }

/*
D:\8Assignment\2ArraysAssignment\Assignment\8to20>java Intersection9
Common values: 3 9
 */