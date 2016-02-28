import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Integer> l = Arrays.asList(new Integer[]{1, 2, 3});

        Node ll = Node.listToll(l);

        System.out.println(ll.data);
        Node.printll(ll);
    }

    public class RemoveDuplicates {



        RemoveDuplicates() {

        }


        Node removeDuplicates(Node head) {
            // This is a "method-only" submission.
            // You only need to complete this method.
            if (head == null)
                return head;

            Node current = head;
            Node next = head.next;
            Node dupEnd = null;

            // while not at end of list...
            while (next != null) {

                // if we have a duplicate, shorten until not a duplicate
                while (current.data == next.data) {

                    current.next = next.next;

                    if (next.next == null)
                        return head;
                    else {
                        current = current.next;
                        next = next.next.next;
                    }
                }
                if (next != null) {
                    current = next;
                    next = next.next;
                } else {
                    return head;
                }
            }

            return head;


        }
    }

}


