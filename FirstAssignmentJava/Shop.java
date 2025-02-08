class Shop {

   public static void main(String[] args) {

       

       System.out.println("Enter user quantity: ");
       int quantity = new java.util.Scanner(System.in).nextInt();

       if (quantity>1000) {
            System.out.println("Quantity is : " +quantity); 
            System.out.println("Discount 10% of quantity is : " +(quantity*10/100));
            System.out.println("Total cost for user pay after discount : " +(quantity-(quantity*10/100)));
        
       }
       else{
           System.out.println("No any discount");
       }

   }

}
    

