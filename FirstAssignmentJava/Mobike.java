public class Mobike {

    String bno;
    String name;
    int days;
    int charge;
    
//    void input(String bikeNum, String cname){
//        bno = bikeNum;
//        name = cname;
//     }
   void input(){
       System.out.println("Enter bike number : ");
       bno = new java.util.Scanner(System.in).nextLine();
       System.out.println("Enter customer name : ");
       name = new java.util.Scanner(System.in).nextLine();
       System.out.println("Enter the number of days : ");
       days = new java.util.Scanner(System.in).nextInt();      
    }

    void compute(){

        if(days <= 5){
            charge = 500*days;
        }
        else if(days>5 && days<=10){
            charge = 2500+400*(days-5);
        }
        else if(days>10){
            charge = 2500+2000+200*(days-10);
            }
    }
    

void display(){
       System.out.print("bike number"+"\t\t"+"customer name"+"\t"+"Days"+"\t"+"charge");
            System.out.println(" ");
            System.out.print(bno+ "\t\t");
            System.out.print(name+ "\t\t");
            System.out.print(days+ "\t");
            System.out.print(charge+ "\t");
}
public static void main(String[] args) {
    Mobike m1 = new Mobike();
   // Mobike m2 = new Mobike();
    m1.input();  // if we not take input fron userthen we need to pass actuel argements("UP65AB1234", "Ani");
    m1.compute();
    m1.display();

    // m2.input();  
    //m2.compute();
    //m2.display();
 }


    
}
