

public class ThreeLargestValue311 {
    
    
        public static void main(String[] args) {
            int[] arr = { 10, 5, 20, 15, 30, 25 };
    
            // Initialize variables
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            int thirdLargest = Integer.MIN_VALUE;
    
            // Iterate through the array
            for (int num : arr) {
                if (num > largest) {
                    thirdLargest = secondLargest;
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    thirdLargest = secondLargest;
                    secondLargest = num;
                } else if (num > thirdLargest && num != secondLargest) {
                    thirdLargest = num;
                }
            }
    
            System.out.println("Three largest values:");
            System.out.println("1st largest: " + largest);
            System.out.println("2nd largest: " + secondLargest);
            System.out.println("3rd largest: " + thirdLargest);
        }
    }
    
/*
D:\8Assignment\2ArraysAssignment\Assignment\20TO30>java ThreeLargestValue311
Three largest values:
1st largest: 30
2nd largest: 25
3rd largest: 20
 */