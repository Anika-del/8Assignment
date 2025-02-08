import java.util.LinkedList;

public class DeleteNode {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> List = new LinkedList<>();

        // Add some elements
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);

        // Print linked list
        System.out.println("Original Linked List: " + List);

        // Node to delete (let's say we want to remove the node with value 3)
        Integer nodeToDelete = 3;

        // Remove the specified node
        boolean removed = List.remove(nodeToDelete);

        if (removed) {
            System.out.println("Node " + nodeToDelete + " removed successfully.");
        } else {
            System.out.println("Node " + nodeToDelete + " not found in the linked list.");
        }

        // Print the updated linked list
        System.out.println("Updated Linked List: " + List);
    }
}
