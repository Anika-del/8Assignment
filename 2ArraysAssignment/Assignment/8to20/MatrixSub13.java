//void MatrixMult(int x[][],int y[][]); 

import java.util.Arrays;

    public class MatrixSub13 {
        public static void main(String[] args) {
            // Example matrices (you can replace these with your own data)
            int[][] x = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            int[][] y = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
            };
    
            // Check if matrices can be multiplied (columns of x == rows of y)
            if (x[0].length != y.length) {
                System.out.println("Matrices cannot be multiplied. Column count of x must equal row count of y.");
                return;
            }
    
            // Initialize the result matrix
            int[][] result = new int[x.length][y[0].length];
    
            // Perform matrix multiplication
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < y[0].length; j++) {
                    for (int k = 0; k < y.length; k++) {
                        result[i][j] += x[i][k] - y[k][j];
                    }
                }
            }
    
            // Print the result matrix
            System.out.println("Resultant matrix after multiplication:");
            for (int[] row : result) {
                System.out.println(Arrays.toString(row));
            }
        }
    }
    /*
   Resultant matrix after multiplication:
[-12, -9, -6]
[-3, 0, 3]
[6, 9, 12]
     */