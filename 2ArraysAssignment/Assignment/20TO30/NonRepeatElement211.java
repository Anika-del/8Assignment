
public class NonRepeatElement211 {
    
    public static void main(String[] args) {
        
        int[] arr = {12,34,65,32,12,56,78};
        for(int k=0; k<arr.length; k++){
            // System.out.println("Repeated arrays are  ");
            // System.out.print("  "+ arr);
        }


        for(int i=0; i<arr.length; i++){
//all value store in x
            int x = arr[i];
            int count=0; //dono loop count ke value ko match krenge 
            for(int j=0; j<arr.length; j++){
                if(arr[j] == x){
                    count++;
                }
            }
            //if count = 1 hoga to print krega
            if(count == 1){
                
                System.out.print(" "+ arr[i]);
            }
          //  System.out.println(arr[i]);
        }
    }
}
