/*
A sum triangle is a pattern where each level contains the sum of consecutive two elements from the previous level. Here’s how we can do it:

 */

 public class SumTriangle144 {
        public static void main(String[] args) {
            int[] arr = { 1, 2, 3, 4, 5 };
            printTriangle(arr);
        }
    
        public static void printTriangle(int[] A) {
            int n = A.length;
            int[][] triangle = new int[n][n];
    
            // Initialize the last row of the triangle
            for (int i = 0; i < n; i++) {
                triangle[n - 1][i] = A[i];
            }
    
            // Fill other rows
            for (int i = n - 2; i >= 0; i--) {
                for (int j = 0; j <= i; j++) {
                    triangle[i][j] = triangle[i + 1][j] + triangle[i + 1][j + 1];
                }
            }
    
            // Print the triangle
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(triangle[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    /*
D:\8Assignment\2ArraysAssignment\Assignment\8to20>java SumTriangle144
48
20 28
8 12 16
3 5 7 9
1 2 3 4 5
     */

