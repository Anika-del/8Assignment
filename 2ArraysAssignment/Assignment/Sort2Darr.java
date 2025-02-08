import java.io.*;
import java.util.*;
class Sort2Darr
{

    public static void main(String[] args) {
        //Create an array
        int ar[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                ar[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<5;i++){ // nexted loop  for diccending order
            for(int j=i+1; j<5; j++){
                if(ar[i]>ar[j]){
                    int temp = ar[i]; // swap a=b=c
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        for(int i=0; i<5; i++){  //print array in accening orger
            System.out.print(ar[i]+" ");
        }

        
    }
}