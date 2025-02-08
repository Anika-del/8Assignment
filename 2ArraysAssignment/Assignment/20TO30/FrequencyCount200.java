//Frequency count means one element howmany time element exist in array

public class FrequencyCount200 {
    
    public static void main(String[] args) {
        //count frequency of All numbers
        int[] a = {10,20,30,54,20,4,4,66,4,10,20,90};
        System.out.println(a.length);

        //then we need to travers arround array then use loop
        for(int i=0; i<a.length; i++){ //
            int x=a[i]; //a[i] means first time value 0 index then  storwe the first place
            //now we are counting
            int count = 0;

            //travers along element
            for(int j=0; j<a.length; j++){
                if(a[j]==x){
                    ++count;
                    //if same value meet then not count -1 kr de
                    a[j] = -1;
                }
            }
            System.out.println("Frequency of x : "+x+" is " +count);
        }
    }
}
