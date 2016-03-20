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
        TreeNode tree2 = new TreeNode(1, new TreeNode(2), null);
        TreeNode oneNode = new TreeNode(1);
        for(String string: binaryTreePaths(tree))
            System.out.println(string);

    }
    public static List<String> binaryTreePaths(TreeNode root) {
        // iterative depth first search. keep the path up to
        List<String> paths = new ArrayList<>();
        Stack<TreeNode> toExplore = new Stack<>();
        Stack<TreeNode> pathSoFar = new Stack<>();

        toExplore.push(root);

        while(!toExplore.isEmpty()) {
            TreeNode v = toExplore.pop();
            // process v here
            pathSoFar.push(v);

            // if internal node, continue the search
            if(v.right != null)
                toExplore.push(v.right);
            if(v.left != null)
                toExplore.push(v.left);

            // if leaf node, add full path to the answer list
            if(v.left == null && v.right == null){
                paths.add(pathToString(pathSoFar));
                pathSoFar.pop();
            }
        }

        return paths;
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
