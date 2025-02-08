public class UniqueElementFinder {

       public static int findUniqueElement(int[] arr) {
            int result = 0;
            for (int num : arr) {
                result ^= num;
            }
            return result;
        }
    
        public static void main(String[] args) {
            int[] arr = {2, 3, 5, 4, 5, 3, 4};
            int uniqueElement = findUniqueElement(arr);
            System.out.println("The unique element is: " + uniqueElement);
        }
    }
    /*
    The unique element is: 2
     */
    

