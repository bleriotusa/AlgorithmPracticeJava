package BinaryTreefromPreorderInorder;

import common.BinaryTreeNode;

import java.util.Iterator;
import java.util.List;

/**
 * Using a preorder traversal and an inorder traversal, reconstruct the tree the orderings were made from.
 *
 *                  100
 *              /           \
 *          50                  175
 *       /      \            /      \
 *   20           70      123           200
 *      \                                   \
 *        23                                223
 */
public class BinaryTreefromPreorderInorder {
    static BinaryTreeNode<Integer> binaryTreefromPreorderInorder(List<Character> preorder, List<Character> inorder) {
//        BinaryTreeNode processingNode = binaryTree;

        Iterator<Character> porder = preorder.iterator();
        Iterator<Character> iorder = inorder.iterator();

        char pNext = porder.next();
        char iNext = iorder.next();

        BinaryTreeNode binaryTree, processingNode = binaryTree = new BinaryTreeNode(pNext);

        /** create new left node
         * traverse down until we meet the inorder node
         * then traverse inorder back up the tree until we don't match (if parent doesn't match, go right)
         *
         */
        while (porder.hasNext() || iorder.hasNext()) {


            while (porder.hasNext() && pNext != iNext) {
                pNext = porder.next();

                processingNode.left = new BinaryTreeNode(pNext);
                processingNode = processingNode.left;

            }

            iNext = iorder.next();

        }



        return binaryTree;
    }
}

/**
 case 1:
            D

         B    E
      A    C
 [D, B, A, C, E]
 [A, B, C, D, E]



 */