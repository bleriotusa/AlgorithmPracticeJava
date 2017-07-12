package BinaryTreefromPreorderInorder;
import static BinaryTreefromPreorderInorder.BinaryTreefromPreorderInorder.binaryTreefromPreorderInorder;

import common.BinaryTreeNode;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by MichaelLeisure on 7/4/17.
 */
class BinaryTreefromPreorderInorderTest {
    int x;
    @AfterEach
    public void spaceTest() {
        x = 5;
        System.out.println('\n');
    }

    @Test
    void binaryTreefromPreorderInorderTest() {
        /**
         case 1:
                D

             B       E
         A    C
         [D, B, A, C, E]
         [A, B, C, D, E]



         */
        List<Character> preorder = Arrays.asList('D', 'B', 'A', 'C', 'E');
        List<Character> inorder = Arrays.asList('A', 'B', 'C', 'D', 'E');
        BinaryTreeNode result = binaryTreefromPreorderInorder(preorder, inorder);

        BinaryTreeNode.printTree(result);

    }

    @Test
    void binaryTreefromPreorderInorderTest2() {
        /**
         *                  100
         *              /           \
         *          50                  175
         *       /      \            /      \
         *   20           70      123           200
         *      \                                   \
         *        23                                223
         */

        List<Integer> preorder = Arrays.asList(100, 50, 20, 23, 70, 175, 123, 200, 223);
        List<Integer> inorder = Arrays.asList(20, 23, 50, 70, 100, 123, 175, 200, 223);
        BinaryTreeNode<Integer> result = binaryTreefromPreorderInorder(preorder, inorder);

        BinaryTreeNode.printTree(result);

    }

}