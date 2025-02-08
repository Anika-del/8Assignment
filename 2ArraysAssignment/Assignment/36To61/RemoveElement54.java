public class RemoveElement54 {

    public static void main(String[] args) {
        
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
int indexToRemove = 3; // Index of the element to remove

int[] copy = new int[array.length - 1];
for (int i = 0, j = 0; i < array.length; i++) {
    if (i != indexToRemove) {
        copy[j++] = array[i];
    }
}
// Now 'copy' contains: 10, 20, 30, 50, 60, 70, 80, 90, 100
System.out.println(array.length);

    }
    
}
