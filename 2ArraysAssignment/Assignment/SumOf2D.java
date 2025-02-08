// Java code for the above approach
import java.util.Scanner;
 
class SumOf2D {
  
  static int M = 4;
  static int N = 4;
 
 
  static int sum(int arr[][])
  {
    int sum = 0;
 
   
    for (int i=0; i < M; ++i) {
      for (int j=0; j < N; ++j) {
        
        sum = sum + arr[i][j];
      }
    }
    return sum;
  }
 
  public static void main (String[] args)
  {
    int i, j;
    int arr[][]= new int[M][N];
 
    // matrix elements
    int x = 1;
    for (i = 0; i < M; i++)
      for (j = 0; j < N; j++)
        arr[i][j] = x++;
 
    // sum
    System.out.println(sum(arr));
  }
}
 
