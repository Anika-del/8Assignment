public class HCF30 {
    
       public static void main(String[] args) {
            int num1 = 24;
            int num2 = 36;
            int hcf = getHCF(num1, num2);
            System.out.println("The HCF: " + hcf);
        }
    
        static int getHCF(int a, int b) {
            if (b == 0) {
                return a;
            }
            return getHCF(b, a % b);
        }
    }
/*
D:\8Assignment\2ArraysAssignment\Assignment\20TO30>java HCF30
The HCF: 12
 */