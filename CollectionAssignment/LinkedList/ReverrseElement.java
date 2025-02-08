import java.util.Collections;
import java.util.LinkedList;

public class ReverrseElement {
    public static void main(String[] args) {
        LinkedList<String> Linklist = new LinkedList<>();
        Linklist.add("A");
        Linklist.add("B");
        Linklist.add("C");
        Linklist.add("D");
        Linklist.add("E");
        Linklist.add("F");
        Linklist.add("G");

        System.out.println("Original Linked List: " + Linklist);

        // Reverse the linked list using Collections.reverse()
        Collections.reverse(Linklist);

        System.out.println("Reversed Linked List: " + Linklist);
    }
}
