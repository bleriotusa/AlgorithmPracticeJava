package BinaryTreePaths;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * Given a binary tree, return all root-to-leaf paths.
 * For example, given the following binary tree:
 *    1
 *  /   \
 * 2     3
 * \
 * 5
 *
 * All root-to-leaf paths are:
 * ["1->2->5", "1->3"]
 */
public class BinaryTreePaths {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3));
        TreeNode tree2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode oneNode = new TreeNode(1);
        for(String string: binaryTreePaths(tree2))
            System.out.println(string);

    }
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        StringBuilder pathSoFar = new StringBuilder();
        binaryTreePaths(root, paths, pathSoFar);
        return paths;
    }

    /** Idea: Depth first search recursively, keeping track of the "running path", or the path up to the current node.
     * Then every time we get to a leaf, add the running path to the list of answer paths, and then backtrack by
     * popping the running path stack.
     */
    public static void binaryTreePaths(TreeNode root, List<String> paths, StringBuilder pathSoFar) {
        // depth first search recursively, but use an iterative approach instead of expression approach

        // base case, no tree, so empty list of paths
        if(root == null) {
            return;
        }

        // add current node to the running path stack
        pathSoFar.append(root.val + "->");

        // search left
        if(root.left != null)
            binaryTreePaths(root.left, paths, pathSoFar);

        // search right
        if(root.right != null)
            binaryTreePaths(root.right, paths, pathSoFar);

        // if leaf node, add the path to the answer list
        else if(root.right == null && root.left == null)
            paths.add(pathSoFar.substring(0, pathSoFar.length()-2));

        // update the path so far by backtracking 3 (removing these symbols: ->#)
        pathSoFar.setLength(pathSoFar.length()-3);
    }

    static String pathToString(Stack<TreeNode> nodes) {
        if(nodes.empty())
            return "";

        String path = "";
        for(TreeNode node : nodes) {
            path += node.val + "->";
        }
        return path.substring(0, path.length()-2);
    }
}
