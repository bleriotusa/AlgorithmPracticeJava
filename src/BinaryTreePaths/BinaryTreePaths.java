package BinaryTreePaths;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
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
        for(String string: binaryTreePaths(tree))
            System.out.println(string);

    }
    public static List<String> binaryTreePaths(TreeNode root) {
        // depth first search. expression is: left list + right list
        List<String> paths = new ArrayList<>();
        if(root == null) {
            paths.add("");
            return paths;
        }

        String pathStart = root.val + "->";
        if(root.left != null) {
            for (String path : binaryTreePaths(root.left))
                paths.add(pathStart + path);
        }
        else
            paths.add("" + root.val);
        if(root.right != null) {
            for (String path : binaryTreePaths(root.right))
                paths.add(pathStart + path);
        }
        else if(!paths.contains("" + root.val))
            paths.add("" + root.val);
//        paths.addAll(binaryTreePaths(root.left).stream().map(node -> pathStart + node).collect(Collectors.toList()));
//        paths.addAll(binaryTreePaths(root.right).stream().map(node -> pathStart + node).collect(Collectors.toList()));

        return paths;
    }
}
