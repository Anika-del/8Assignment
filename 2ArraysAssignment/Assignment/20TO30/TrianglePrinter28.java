
public class TrianglePrinter28 {
    
   
        public static void main(String[] args) {
            printTriangle(4);
        }
    
        public static void printTriangle(int size) {
            int numSize = 0;
            while (numSize < size) {
                printSpaces(size - numSize - 1);
                printStars(numSize);
                numSize++;
            }
        }
    
        public static void printSpaces(int number) {
            int numSpaces = 0;
            while (numSpaces < number) {
                System.out.print(" ");
                numSpaces++;
            }
        }
    
        public static void printStars(int number) {
            int numStar = 0;
            while (numStar <= number) {
                System.out.print("*");
                numStar++;
            }
            System.out.println();
        }
    }
