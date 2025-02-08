public class FindMode34 {
    

        public static void main(String[] args) {
            // Example input array
            int[] myArray = { 1, 2, 3, 2, 4, 5, 2, 6, 2, 7, 2, 8, 9, 2 };
    
            // Call the findMode method
            int mode = (int) findMode(myArray);
    
            if (Double.isNaN(mode)) {
                System.out.println("No mode found (empty array).");
            } else {
                System.out.println("The mode is: " + mode);
            }
        }
    
        public static double findMode(int[] data) {
            if (data.length == 0) {
                return Double.NaN;
            }
    
            int[] counts = new int[data.length];
            double maxValue = Double.NaN;
            int maxCount = 0;
    
            for (int i = 0; i < data.length; i++) {
                int count = 0;
                for (int j = 0; j < data.length; j++) {
                    if (data[j] == data[i]) {
                        count++;
                    }
                }
                if (count > maxCount) {
                    maxValue = data[i];
                    maxCount = count;
                }
            }
    
            return maxValue;
        }
    }
    /*
    The mode is: 2
     */