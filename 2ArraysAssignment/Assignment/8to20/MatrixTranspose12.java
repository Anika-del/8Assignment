/*
void MatrixTranspose(int x[][]);
Answer :- transpose a matrix using a 2D array. The goal is to convert rows into columns and columns into rows.

*/
public class MatrixTranspose12 {
        public static void main(String[] args) {
            int[][] m = {
                {3, 6, 9},
                {4, 1, 5},
                {5, 8, 7}
            };
    
            // Print the original matrix
            System.out.println("Original Matrix:");
            printMatrix(m);
    
            // Transpose the matrix
            int[][] transposedMatrix = transpose(m);
    
            // Print the transposed matrix
            System.out.println("\nTransposed Matrix:");
            printMatrix(transposedMatrix);
        }
    
        public static int[][] transpose(int[][] x) {
            int rows = x.length;
            int columns = x[0].length;
    
            // Create a new matrix for the transposed result
            int[][] result = new int[columns][rows];
    
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result[j][i] = x[i][j];
                }
            }
    
            return result;
        }
    
        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
    }
/*
D:\8Assignment\2ArraysAssignment\Assignment\8to20>java MatrixTranspose12
Original Matrix:
3 6 9
4 1 5
5 8 7

Transposed Matrix:
3 4 5
6 1 8
9 5 7
 */