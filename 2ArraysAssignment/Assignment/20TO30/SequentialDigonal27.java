    
    public class SequentialDigonal27 {
        public static void main(String[] args) {
            int[][] array = {
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15, 16, 17, 18, 19},
                // ... (other rows)
                {90, 91, 92, 93, 94, 95, 96, 97, 98, 99}
            };
    
            int diagonalSum = calculateDiagonalSum(array);
            System.out.println("Sum of diagonal elements: " + diagonalSum);
        }
    
        public static int calculateDiagonalSum(int[][] array) {
            int total = 0;
            for (int row = 0; row < array.length; row++) {
                total += array[row][row]; // Add diagonal elements
            }
            return total;
        }
    }