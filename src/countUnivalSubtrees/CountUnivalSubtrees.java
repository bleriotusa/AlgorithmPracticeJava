package countUnivalSubtrees;

import common.TreeNode;

/**
 * Created by Michael Chen on 4/6/16.
 */
public class CountUnivalSubtrees {
    public int countUnivalSubtrees(TreeNode root) {
        if(root == null)
            return 0;

        else if(root.left == null && root.right == null)
            return 1;



        return countUnivalSubtrees(root.left) + countUnivalSubtrees(root.right);
    }
}
