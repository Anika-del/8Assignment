public class SpiralMatrix61 {
    
    public static void printSpiral(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
    
            int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
    
            while (top <= bottom && left <= right) {
                // Print top row
                for (int i = left; i <= right; i++) {
                    System.out.print(matrix[top][i] + " ");
                }
                top++;
    
                // Print rightmost column
                for (int i = top; i <= bottom; i++) {
                    System.out.print(matrix[i][right] + " ");
                }
                right--;
    
                // Print bottom row
                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        System.out.print(matrix[bottom][i] + " ");
                    }
                    bottom--;
                }
    
                // Print leftmost column
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        System.out.print(matrix[i][left] + " ");
                    }
                    left++;
                }
            }
        }
    
        public static void main(String[] args) {
            int[][] arr = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
            printSpiral(arr);
        }
    }
    
/*
D:\8Assignment\2ArraysAssignment\Assignment\36To61>java SpiralMatrix61
10 20 30 60 90 80 70 40 50
 */