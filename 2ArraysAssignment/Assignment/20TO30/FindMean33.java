
public class FindMean33 {
    
        public static double calculateMean(int[] arr) {
            double sum = 0;
            for (int value : arr) {
                sum += value;
            }
            return sum / arr.length;
        }
    
        public static void main(String[] args) {
            int[] myArray = { 10, 20, 30, 40, 50 }; // Replace with your own array
            double mean = calculateMean(myArray);
            System.out.println("Mean: " + mean);
        }
    }
    
/*
D:\8Assignment\2ArraysAssignment\Assignment\20TO30>java FindMean33
Mean: 30.0
 */