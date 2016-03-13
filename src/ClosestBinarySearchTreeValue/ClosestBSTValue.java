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
}


public class ClosestBSTValue {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2147483647);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(7);
        ClosestBSTValue answer = new ClosestBSTValue();
        System.out.println(answer.closestValue(root, 0.0));
    }
    double lastValue = Double.MAX_VALUE;
    boolean left = false;

    public int closestValue(TreeNode root, double target) {
        // do a binary search, keeping track of the last value
        if (root == null) {
            return (int) lastValue;
        }
        else if(root.val == target) {
            return root.val;
        }
        else if (target < root.val) {
            if(root.left == null) {
                // if root is a right node, and going left is null, either root or parent is the answer
                if(!left) {
                    return Math.abs(target - root.val) > Math.abs(target - lastValue)? (int) lastValue : root.val;
                }
                // if root is a left node, and going left is null, then target < root < parent, so root must be closest
                else
                    return root.val;
            }
            left = true;
            lastValue = root.val;
            return closestValue(root.left, target);
        }
        else {
            if (root.right == null) {
                if(left) {
                    return Math.abs(target - root.val) > Math.abs(target - lastValue)? (int) lastValue : root.val;
                }
                else
                    return root.val;
            }
            left = false;
            lastValue = root.val;
            return closestValue(root.right, target);
        }
    }
}