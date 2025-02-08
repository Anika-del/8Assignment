public class ReverseArray59 {
    
        public static void reverse(int[] arr) {
            int left = 0;
            int right = arr.length - 1;
    
            while (left < right) {
                // Swap elements at left and right indices
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
    
                // Move the pointers towards each other
                left++;
                right--;
            }
        }
    
        public static void main(String[] args) {
            int[] array = {10, 20, 30, 40, 50};
            reverse(array);
    
            System.out.println("Reversed array:");
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
    }
    
/*
Reversed array:
50 40 30 20 10
 */