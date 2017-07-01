package RemoveDuplicates;

import common.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer[]> testCases = new ArrayList<>();

        Integer[] in0 = {1};
        Integer[] in3 = {1, 1};
        Integer[] in1 = {1, 2, 3};
        Integer[] in2 = {1, 2, 2, 3};
        Integer[] in4 = {1, 1, 1, 2, 3, 3, 3};

        testCases.addAll(Arrays.asList(new Integer[][]{in0, in1, in2, in3, in4}));
        int testNum = 1;

        for (Integer[] testCase : testCases) {
            System.out.println(String.format("\nTest %d", testNum++));
            List<Integer> l = Arrays.asList(testCase);

            Node ll = Node.listToll(l);
            System.out.print("Input: ");
            Node.printll(ll);

            Node answer = removeDuplicates(ll);
            System.out.print("Output: ");
            Node.printll(answer);
        }
    }


    static Node removeDuplicates(Node head) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        if (head == null)
            return head;

        Node current = head;
        Node next = head.next;
        Node dupEnd = null;

        // while not at end of list...
        while (next != null) {

            // if we have a duplicate...
            // 1. shorten until not a duplicate
            // 2. connect the current node to the next node that is not the same
            if (current.data == next.data) {
                while (next != null && current.data == next.data) {
                    dupEnd = next.next;
                    next = dupEnd;
                }

                current.next = dupEnd;
            }

            // advance if still can. if we can't, we're at the end and we'll break out and return anyway
            if (next != null) {
                current = next;
                next = next.next;
            }
        }

        return head;
    }
}


