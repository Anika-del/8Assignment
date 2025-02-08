import java.util.LinkedList;

public class DisplayElement {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("cherry");

        // Display all elements
        System.out.println("Linked List Elements:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
