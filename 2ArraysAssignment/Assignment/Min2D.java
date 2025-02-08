import java.io.*;
import java.util.*;
class Min2D{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i, j, min;
        //Create an array
        int ar[][] = new int[3][3];
        System.out.println("Enter the numbers ");
        for(i=0; i<3; i++){    //for 2D array take 2 loop i, j;
            for(j=0; j<3; j++){
                ar[i][j] = sc.nextInt();
            }
        }

        min = ar[0][0];
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                if(ar[i][j]<min){
                    min = ar[i][j]; //sorting the max element
                }
            }
        }
        
        System.out.println("Minmum element "+ min);
        
    }
}