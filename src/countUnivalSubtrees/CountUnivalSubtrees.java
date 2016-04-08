package countUnivalSubtrees;

import common.TreeNode;

import java.util.Stack;

/**
 * Created by Michael Chen on 4/6/16.
 */
public class CountUnivalSubtrees {


    /**
     * Ask every node if it as a subtree is a UnivalSubtree and add them up
     * @param root
     * @return
     */
    static protected int countUnivalSubtrees(TreeNode root) {
        if (root == null)
            return 0;

        int rootVal = isUnivalTree(root) ? 1 : 0;
        return countUnivalSubtrees(root.left) + countUnivalSubtrees(root.right) + rootVal;
    }


    static boolean isUnivalTree(TreeNode root) {
        if (root == null )
            return false;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode current;

        /* Depth first search, and compute if the node is equal to the root. If any are not, this is not a UnivalTree */
        while (!stack.empty()) {
            current = stack.pop();

            if (current.val != root.val)
                return false;

            if (current.left != null)
                stack.push(current.left);
            if (current.right != null)
                stack.push(current.right);
        }
        return true;
    }


/*    static protected boolean isUnivalTree(TreeNode root) {
        if(root == null)
            return false;

        else if(root.left == null && root.right == null)
            return false;

        // if left/right exists, then left/right must equal current val
        return (root.left == null || root.left.val == root.val && isUnivalTree(root.left)) && (root.right == null || root.right.val == root.val &&
        isUnivalTree(root.right));
    }*/

}
