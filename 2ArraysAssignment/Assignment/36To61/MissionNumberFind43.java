
public class MissionNumberFind43 {
    
   
        public static void main(String[] args) {
            int[] arr = { /* Your array here */ }; // Fill in your array
    
            // Calculate the total sum of numbers from 1 to 100
            int totalSum = 100 * (100 + 1) / 2;
    
            // Compute the sum of the numbers in the array
            int arraySum = 0;
            for (int num : arr) {
                arraySum += num;
            }
    
            // Find the missing number
            int missingNumber = totalSum - arraySum;
    
            System.out.println("The missing number is: " + missingNumber);
        }
    }
    /*
    D:\8Assignment\2ArraysAssignment\Assignment\36To61>java MissionNumberFind43
The missing number is: 5050
     */
    
