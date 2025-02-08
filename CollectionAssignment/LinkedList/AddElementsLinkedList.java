import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("e");
        linkedList.add("e");
        linkedList.add("k");

        // Display the original LinkedList
        System.out.println("Original Linked list: " + linkedList);

        // Add an element at the first position
        linkedList.addFirst("G");

        // Add an element at the last position
        linkedList.addLast("s");

        // Display the updated LinkedList
        System.out.println("Updated Linked list: " + linkedList);
    }
}
