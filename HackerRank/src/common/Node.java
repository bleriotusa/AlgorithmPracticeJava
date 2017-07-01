package common;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Michael on 2/25/2016.
 */
public class Node {
    public int data;
    public Node next;

    public Node() {
        next = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(Node next) {
        this.next = next;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public static Node arrayToll(Integer[] array) {
        return listToll(Arrays.asList(array));
    }

    public static Node listToll(List<Integer> list) {
        if(list.size() == 0)
            return null;

        return new Node(list.get(0), listToll(list.subList(1, list.size())));

    }

    public static void printll(Node ll) {
        while(ll != null) {
            System.out.print(String.format("%d ", ll.data));
            ll = ll.next;
        }
        System.out.println("");
    }
}








