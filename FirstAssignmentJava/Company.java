class Company {

    public static void main(String[] args) {
 
        
        System.out.println("Enter Total salary : ");
        int salary = new java.util.Scanner(System.in).nextInt();
  
        System.out.println("Enter year of sevice : ");
        int year = new java.util.Scanner(System.in).nextInt();
  
        if (year>5) {
            System.out.println("The total salary is "+salary);
            System.out.println("Bonus is 5% "+salary*5/100);
            System.out.println("The total salary with bonus "+(salary+(salary*5/100)));
         
        }
        else{
            System.out.println("No any bonous ammount ");
        }
 
    }
 
 }
     

