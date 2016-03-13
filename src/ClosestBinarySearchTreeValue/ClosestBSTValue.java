package ClosestBinarySearchTreeValue;

/**
 * Created by Michael on 3/12/16.
 */

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    TreeNode(int x, TreeNode left, TreeNode right) {
        val = x;
        this.left = left;
        this.right = right;
    }
}


public class ClosestBSTValue {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        root.right = new TreeNode(5);
        ClosestBSTValue answer = new ClosestBSTValue();
        System.out.println(answer.closestValue(root, 3.78));
    }

    double bestValue = Double.MAX_VALUE;

    /**
     * Do a binary search, keeping track of the closest value to the target on the log(n) path
     * Guaranteed to be on the search path, because we always search to get closer to the target.
     * <p>
     * bestValue calculation = (distance from target to root < distance from target to best contender)? root value : keep best value
     */
    public int closestValue(TreeNode root, double target) {
        if (root == null) {
            return (int) bestValue;
        } else if (root.val == target) {
            return root.val;
        } else if (target < root.val) {
            bestValue = (Math.abs(target - root.val) < Math.abs(target - bestValue) ? root.val : bestValue);
            return closestValue(root.left, target);
        } else {
            bestValue = (Math.abs(target - root.val) < Math.abs(target - bestValue) ? root.val : bestValue);
            return closestValue(root.right, target);
        }
    }
}