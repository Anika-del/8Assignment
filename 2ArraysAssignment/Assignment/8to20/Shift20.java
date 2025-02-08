public class Shift20 {
    
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Input array : "); //using for loop
        for(int i=1; i<a.length; i++){
            System.out.print(" "+i);
        }




        //one digit shift
        int first=a[0];
        for(int j=0; j<a.length-1; j++){
            a[j] = a[j+1];
        }
        System.out.println();
//asign first element at last place
         a[a.length-1]=first;
         System.out.println("Output Array : ");
         for(int i=0; i<a.length; i++){
            System.out.print(" "+a[i]);
        }



         //second digit shift
         int second=a[0];
        for(int k=0; k<a.length-1; k++){
            a[k] = a[k+1];
        }
        System.out.println();
//asign second element at second last place
         a[a.length-1]=second;
         System.out.println("Output Array : ");
         for(int i=0; i<a.length; i++){
            System.out.print(" "+a[i]);
        }
}
}
/*
D:\8Assignment\2ArraysAssignment\Assignment\8to20>java Shift20
Input array :
 1 2 3 4 5 6 7 8 9
Output Array :
 2 3 4 5 6 7 8 9 10 1
Output Array :
 3 4 5 6 7 8 9 10 1 2
 */