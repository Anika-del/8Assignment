
public class FindMedeian32 {
    
   
        public static void main(String[] args) {
            int n = 5;
            double[] a = new double[n];
            a[0] = 10;
            a[1] = 20;
            a[2] = 30;
            a[3] = 40;
            a[4] = 50;
            double median;
            if (n % 2 == 1) {
                median = a[(n + 1) / 2 - 1];
            } else {
                median = (a[n / 2 - 1] + a[n / 2]) / 2;
            }
            System.out.println("Median: " + median);
        }
    }
    
/*
D:\8Assignment\2ArraysAssignment\Assignment\20TO30>java FindMedeian32
Median: 30.0
 */