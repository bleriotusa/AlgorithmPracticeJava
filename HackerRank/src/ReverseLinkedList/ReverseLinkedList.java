package ReverseLinkedList;
import common.Node;

/**
 * Created by Michael J Chen bleriotusa@gmail.com on 3/24/16.
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        Node ll = Node.arrayToll(array);

        Node.printll(reverseLinkedList(ll));
    }

    static Node reverseLinkedList (Node head) {
        Node current = head;
        Node previous = head;
        Node next = head.next;

        current.next = null;

        while(next != null) {
            previous = current;
            current = next;
            next = next.next;

            current.next = previous;
        }

        return current;
    }
}
