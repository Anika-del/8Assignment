   public class MaxElementInArow24 {
    //Maximum element in Each rows
            public static void main(String[] args) {
                int[][] matrix = {
                    {3, 4, 1, 8},
                    {1, 4, 9, 11},
                    {76, 34, 21, 1},
                    {2, 1, 4, 5}
                };
        
                maxElement(matrix);
            }
        
            public static void maxElement(int[][] arr) {
                int numRows = arr.length;
                int[] result = new int[numRows];
        
                for (int i = 0; i < numRows; i++) {
                    int max = Integer.MIN_VALUE;
                    for (int j = 0; j < arr[i].length; j++) {
                        if (arr[i][j] > max) {
                            max = arr[i][j];
                        }
                    }
                    result[i] = max;
                }
        
                printArray(result);
            }
        
            private static void printArray(int[] result) {
                for (int i = 0; i < result.length; i++) {
                    System.out.println(result[i]);
                }
            }
        }
        
   /*
   D:\8Assignment\2ArraysAssignment\Assignment\20TO30>java MaxElementInArow23
8
11
76
5
   */ 

