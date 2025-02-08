    
import java.util.ArrayList;
import java.util.Collections;

public class MaxOneRow24  {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int row = mat.length;
        int col = mat[0].length;

        // Calculate sum of each row and store in ArrayList
        ArrayList<Integer> rowSums = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += mat[i][j];
            }
            rowSums.add(sum);
        }

        // Find the maximum row sum and its index
        int maxRowSum = Collections.max(rowSums);
        int maxRowIndex = rowSums.indexOf(maxRowSum);

        System.out.println("Maximum row sum is " + maxRowSum + " at row " + maxRowIndex);
    }
}
/*
D:\8Assignment\2ArraysAssignment\Assignment\20TO30>java BinaryToecimal23
Decimal Equivalent of 1010 is 10
Decimal Equivalent of 1100 is 12
 */