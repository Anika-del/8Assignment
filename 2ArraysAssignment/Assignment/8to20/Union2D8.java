    
    import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

    public class Union2D8  {
        public static List<Integer> unionArray(int[] arr1, int[] arr2) {
            Set<Integer> set = new HashSet<>();
            
            for (int i = 0; i < arr1.length; i++) {
                set.add(arr1[i]);
            }
            
            for (int i = 0; i < arr2.length; i++) {
                set.add(arr2[i]);
            }
            
            return new ArrayList<>(set);
        }
    
        public static void main(String[] args) {
            int[] arr1 = {1, 2, 2, 2, 3};
            int[] arr2 = {2, 3, 3, 4, 5, 5};
            
            List<Integer> union = unionArray(arr1, arr2);
            System.out.print("Union is: ");
            for (int num : union) {
                System.out.print(num + " ");
            }
        }
    }
/*
 D:\8Assignment\2ArraysAssignment\Assignment\8to20>java Union2D8
Union is: 1 2 3 4 5
 */