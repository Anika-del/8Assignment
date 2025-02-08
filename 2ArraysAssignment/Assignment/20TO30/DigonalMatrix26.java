public class DigonalMatrix26 {
    public static void printPrincipalDiagonal(int[][] mat, int n) {
        System.out.print("Principal Diagonal: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    System.out.print(mat[i][j] + ", ");
            }
        }
        System.out.println();
    }

    public static void printSecondaryDiagonal(int[][] mat, int n) {
        System.out.print("Secondary Diagonal: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) == (n - 1))
                    System.out.print(mat[i][j] + ", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] a = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };

        printPrincipalDiagonal(a, n);
        printSecondaryDiagonal(a, n);
    }
}
/*
D:\8Assignment\2ArraysAssignment\Assignment\20TO30>java DigonalMatrix
Principal Diagonal: 1, 6, 3, 8,
Secondary Diagonal: 4, 7, 2, 5,
 */
