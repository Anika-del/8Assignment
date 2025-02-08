public class PairSumFinder45 {

            public static void findPairs(int[] arr, int sum) {
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] + arr[j] == sum) {
                            System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                        }
                    }
                }
            }
        
            public static void main(String[] args) {
                int[] arr = {2, 5, 7, 3, 1, 4};
                int targetSum = 6;
                findPairs(arr, targetSum);
            }
        }

        /*
        D:\8Assignment\2ArraysAssignment\Assignment\36To61>java PairSumFinder45
(2, 4)
(5, 1)
         */
    
    

