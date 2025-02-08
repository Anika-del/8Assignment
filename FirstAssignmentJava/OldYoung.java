class OldYoung {

        public static void main(String[] args) {
    
        System.out.println("Enter First user age :");
        int userA = new java.util.Scanner(System.in).nextInt();
         System.out.println("Enter second user age :");
        int userB = new java.util.Scanner(System.in).nextInt();
         System.out.println("Enter third user age :");
        int userC = new java.util.Scanner(System.in).nextInt();

        if(userA>userB && userA>userC){
        System.out.println("userA is youngest userB and userC");
        }
        else if(userB>userC && userB>userA){
        System.out.println("userB is youngest userA and useC");
        }
        else if(userC>userA && userC>userB){
        System.out.println("userC is youngest userA and userB");
        }   
}   
}

    

