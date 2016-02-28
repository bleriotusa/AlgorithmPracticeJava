import java.util.List;

/**
 * Created by Michael on 2/25/2016.
 */
public class Node {
    int data;
    Node next;

    Node() {
        next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(Node next) {
        this.next = next;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public static Node listToll(List<Integer> list) {
        if(list.size() == 0)
            return null;

        return new Node(list.get(0), listToll(list.subList(1, list.size())));

    }

    public static void printll(Node ll) {
        while(ll != null) {
            System.out.print(ll.data + ' ');
            ll = ll.next;
        }
    }
}








