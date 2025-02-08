import java.util.Collections;
import java.util.LinkedList;

public class SortLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(8);
        linkedList.add(3);
        linkedList.add(7);
        linkedList.add(4);

        System.out.println("Original Linked List: " + linkedList);

        // Sort the linked list in ascending order
        Collections.sort(linkedList);

        System.out.println("Sorted Linked List: " + linkedList);
    }
}
