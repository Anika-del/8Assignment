import java.io.*;
import java.util.*;
class SortArr {

    public static void main(String[] args) {
        
       
        
        //Create an array
        int ar[] = new int[5];
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers ");
        for(int i=0; i<5; i++){
                ar[i] = sc.nextInt(); //i=0 in ar[i], i=1 in ar[i], i=2 in ar[i] andso on
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
