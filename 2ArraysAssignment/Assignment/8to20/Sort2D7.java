    
    import java.util.Arrays;

    public class Sort2D7 {
        public static void main(String[] args) {
           
    
            // exp: Sorting a two-dimensional array
            int[][] arr2D = {
                {13, 7, 6},
                {45, 21, 9},
                {101, 102}
            };
            System.out.println("\n\nOriginal 2D array:");
            for (int[] row : arr2D) {
                System.out.println(Arrays.toString(row));
            }
            // Sort each row individually
            for (int[] row : arr2D) {
                Arrays.sort(row);
            }
            System.out.println("\nSorted 2D array:");
            for (int[] row : arr2D) {
                System.out.println(Arrays.toString(row));
            }
        }
    }
/*
D:\8Assignment\2ArraysAssignment\Assignment\8to20>java Sort2D7


Original 2D array:
[13, 7, 6]
[45, 21, 9]
[101, 102]

Sorted 2D array:
[6, 7, 13]
[9, 21, 45]
[101, 102]
 */