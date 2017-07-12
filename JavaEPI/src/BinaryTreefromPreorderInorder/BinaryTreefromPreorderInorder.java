package BinaryTreefromPreorderInorder;

import common.BinaryTreeNode;

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
 *
 */
class BinaryTreefromPreorderInorder {

    /**
     * @param preorder List of nodes from a preorder traversal
     * @param inorder  List of nodes from an inorder traversal
     * @param <T>      Any type that can be compared
     * @return a Binary Tree reconstructed using the two traversal orders.
     */
    static <T> BinaryTreeNode<T> binaryTreefromPreorderInorder(List<T> preorder, List<T> inorder) {
        // base case 1: if traversals are empty, tree is non-existant
        if (preorder.isEmpty() || inorder.isEmpty())
            return null;

            // base case 2: if both lists have just one equal element, return that as the entire tree.
        else if (preorder.size() == 1 && inorder.size() == 1 && preorder.get(0).equals(inorder.get(0)))
            return new BinaryTreeNode<>(preorder.get(0));

        /* else
        1. Create the root node using the first of the preorder list
        2. Create the left node with a recursive call using the k left nodes derived by the position of the root
            in the inorder list
        3. Create the right node with a recursive call using the nodes from k+1 to list.size()
         */

        T rootValue = preorder.get(0);
        BinaryTreeNode<T> binaryTree = new BinaryTreeNode<>(rootValue);
        int kLeftNodes = inorder.indexOf(rootValue) + 1;

        binaryTree.left = binaryTreefromPreorderInorder(preorder.subList(1, kLeftNodes), inorder.subList(0, kLeftNodes));

        // if there are no nodes in the right side of the list, attach nothing
        // else attach a recursive call of the rest of the list
        binaryTree.right = (kLeftNodes > inorder.size() - 1) ? null : binaryTreefromPreorderInorder(
                preorder.subList(kLeftNodes, preorder.size()),
                inorder.subList(kLeftNodes, inorder.size()));

        return binaryTree;
    }

}

