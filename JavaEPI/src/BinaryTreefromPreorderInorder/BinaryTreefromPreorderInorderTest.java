package BinaryTreefromPreorderInorder;
import static BinaryTreefromPreorderInorder.BinaryTreefromPreorderInorder.binaryTreefromPreorderInorder;

import common.BinaryTreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by MichaelLeisure on 7/4/17.
 */
class BinaryTreefromPreorderInorderTest {
    @Test
    void binaryTreefromPreorderInorderTest() {
        BinaryTreeNode a = new BinaryTreeNode<Integer>(10, new BinaryTreeNode<>(20), new BinaryTreeNode<>(30));
//        BinaryTreeNode.printTree(a);
//        int i=3, j  = 5;
//        System.out.println(String.format("%d, %d", i, j));

        List<Character> preorder = Arrays.asList('D', 'B', 'A', 'C', 'E');
        List<Character> inorder = Arrays.asList('A', 'B', 'C', 'D', 'E');
        BinaryTreeNode result = binaryTreefromPreorderInorder(preorder, inorder);

        BinaryTreeNode.printTree(result);
    }

}