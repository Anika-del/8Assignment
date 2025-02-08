class SumOf2DD {

    public class SumofRowColumn    
{    
    public static void main(String[] args) {    
        int i, j, sumi, sumj;    
            
            
        int a[][] = {       
                        {1, 2, 3},    
                        {4, 5, 6},    
                        {7, 8, 9}    
                    };    //initilization
              
          //Calculates number of rows and columns present in given matrix    
          i = a.length;    
    i = a[0].length;    
            
        //Calculates sum of each row of given matrix    
        for(int k = 0; k < i; k++){    
            sumi = 0;    
            for(int l = 0; l < j; l++){    
              sumi = sumi + a[i][j];    
            }    
            System.out.println("Sum of " + (k+1) +"  i: " + sumi);    
        }    
            
        //Calculates sum of each column of given matrix    
        for(int k = 0; k < j; k++){    
            sumi = 0;    
            for(int l = 0; l < j; l++){    
              sumj = sumj + a[l][k];    
            }    
            System.out.println("Sum of " + (k+1) +" j: " + sumj);    
        }    
    }    
   

    
}
}
