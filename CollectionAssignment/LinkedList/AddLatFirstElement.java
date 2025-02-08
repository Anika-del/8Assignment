
import java.util.LinkedList;

public class AddLatFirstElement {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(10);
        list.add(15);

        System.out.println("List before adding elements at first and last position");
        list.addFirst(16);
        list.addLast(17);
        System.out.println("List after adding elements at first and last position");
       
        
        
        
        
        list.addLast(21);
        list.addLast(22);
        System.out.println("List after adding elements at first and last position");

        System.out.println(list);
    }



}