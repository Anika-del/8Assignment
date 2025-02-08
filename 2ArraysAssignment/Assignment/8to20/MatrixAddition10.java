public class MatrixAddition10 {
    public static void main(String[] args) {
        int[][] firstMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] secondMatrix = {
            {10, 11, 12},
            {13, 14, 15},
            {16, 17, 18}
        };

        int rows = firstMatrix.length;
        int columns = firstMatrix[0].length;

        int[][] sum = new int[rows][columns];

        // Adding Two matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Display the result
        System.out.println("Sum of matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}