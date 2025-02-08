import java.io.*;
import java.util.*;
class MaxMin2D{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i, j, max, min;
        //Create an array
        int ar[][] = new int[3][3];
        System.out.println("Enter the numbers ");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                ar[i][j] = sc.nextInt();
            }
        }

        max = ar[0][0];
        min = ar[0][0];
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                if(ar[i][j]>max){
                    max = ar[i][j]; //sorting the max element
                }
                if(ar[i][j]<min){
                    min = ar[i][j]; //sorting the max element
                }
            }
        }
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(ar[i][j]+" ");
            }System.out.println();
        }
        System.out.println("Maximum element "+ max);
        System.out.println("Minmum element "+ min);
        
    }
}