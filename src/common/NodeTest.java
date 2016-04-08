package common;

import org.junit.After;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Home on 4/3/16.
 */
public class NodeTest {
    @After
    public void inBetween() {
        System.out.println("\n");
    }

    @Test
    public void testListToll() throws Exception {
        Integer llArray[] = {1, 2, 3, 4, 5, 6};
        List<Integer> llList = Arrays.asList(llArray);
        Node ll = Node.listToll(llList);

        Node current = ll;
        // print out items to check correct lists
        for(int i = 0; i < llArray.length; i++) {
            System.out.println(String.format("Array: %d  Linked List: %d",llArray[i], current.data));
            assertEquals(llArray[i].intValue(), current.data);

            current = current.next;
        }
    }

    @Test
    public void testArrayToll() throws Exception {
        Integer llArray[] = {1, 2, 3, 4, 5, 6};
        Node ll = Node.arrayToll(llArray);

        Node current = ll;
        for(int i = 0; i < llArray.length; i++) {
            System.out.println(String.format("Array: %d  Linked List: %d",llArray[i], current.data));
            assertEquals(llArray[i].intValue(), current.data);

            current = current.next;
        }
    }
}