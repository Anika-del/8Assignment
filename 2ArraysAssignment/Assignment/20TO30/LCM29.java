
    
    import java.util.Arrays;

    public class LCM29 {
        public static void main(String[] args) {
            int[] x = { 2, 3, 4, 5, 6 }; // Example array of integers
    
            // Calculate LCM
            long lcm = calculateLCM(x);
    
            // Print the result
            System.out.println("LCM of the array: " + lcm);
        }
    
        // Function to calculate LCM of an array of integers
        static long calculateLCM(int[] arr) {
            long lcm = 1;
            int maxElement = Arrays.stream(arr).max().getAsInt();
    
            for (int i = 1; i <= maxElement; i++) {
                boolean divisible = false;
                for (int num : arr) {
                    if (num % i == 0) {
                        divisible = true;
                        break;
                    }
                }
                if (divisible) {
                    lcm *= i;
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] % i == 0) {
                            arr[j] /= i;
                        }
                    }
                }
            }
            return lcm;
        }
    }
/*
D:\8Assignment\2ArraysAssignment\Assignment\20TO30>java LCM29
LCM of the array: 30
 */