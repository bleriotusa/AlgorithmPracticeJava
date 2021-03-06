package common;

/**
 * Created by Michael on 3/12/16.
 */

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode(int x, TreeNode left, TreeNode right) {
        val = x;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int x, TreeNode left) {
        val = x;
        this.left = left;
        this.right = right;
    }

}