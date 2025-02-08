class LinkedListExample {
    public static class Node {
        int data; // Data of the node
        Node next; // Reference to the next node
    }

    public static void main(String[] args) {
        // Create nodes
        Node newnode1 = new Node();
        Node newnode2 = new Node();
        Node newnode3 = new Node();
        Node newnode4 = new Node();

        // Assign data to nodes
        newnode1.data = 1;
        newnode2.data = 2;
        newnode3.data = 3;
        newnode4.data = 4;

        // Link nodes
        newnode1.next = newnode2;
        newnode2.next = newnode3;
        newnode3.next = newnode4;
        newnode4.next = null;

        // Print the linked list
        Node current = newnode1;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
