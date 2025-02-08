//using sorting
public class ThreeLagestnumber31 {
    
        public static int getThirdLargest(int[] a, int total) {
            int temp;
            for (int i = 0; i < total; i++) {
                for (int j = i + 1; j < total; j++) {
                    if (a[i] > a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            return a[total - 3];
        }
    
        public static void main(String[] args) {
            int[] arr1 = {1, 2, 5, 6, 3, 2};
            int[] arr2 = {44, 66, 99, 77, 33, 22, 55};
    
            System.out.println("Third Largest in arr1: " + getThirdLargest(arr1, 6));
            System.out.println("Third Largest in arr2: " + getThirdLargest(arr2, 7));
        }
    }
    
/*
D:\8Assignment\2ArraysAssignment\Assignment\20TO30>java ThreeLagestnumber31
Third Largest in arr1: 3
Third Largest in arr2: 66
 */