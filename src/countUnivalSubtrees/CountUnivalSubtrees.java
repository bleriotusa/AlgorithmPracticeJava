package countUnivalSubtrees;

import common.TreeNode;

import java.util.Stack;

/**
 * Created by Michael Chen on 4/6/16.
 */
public class CountUnivalSubtrees {

    static protected int countUnivalSubtrees(TreeNode root) {
        if (root == null)
            return 0;

        int rootVal = isUnivalTree(root) ? 1 : 0;

        return rootVal + countUnivalSubtrees(root.left) + countUnivalSubtrees(root.right);
    }


    static boolean isUnivalTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return false;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode current;

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
