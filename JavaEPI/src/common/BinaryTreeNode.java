package common;


import java.util.function.*;

public class BinaryTreeNode<T> {

    public T data;
    public BinaryTreeNode<T> left, right;

    public BinaryTreeNode(T data, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public BinaryTreeNode(T data) {
        this.data = data;
        this.right = this.left = null;
    }


    public static void printTree(BinaryTreeNode tree) {
        printTreeInner(0, tree);
    }

    private static void printTreeInner(int indent, BinaryTreeNode tree) {
        if (tree == null)
            return;

        else {
            printTreeInner(indent + 2, tree.right);

            // build indents and append tree value
            StringBuilder treeLine = new StringBuilder();
            for (int i = 0; i < indent; i++)
                treeLine.append('.');
            treeLine.append(tree.data);
            System.out.println(treeLine);

            printTreeInner(indent + 2, tree.left);
        }
    }

    public boolean equals(BinaryTreeNode right) {
        return this.data == right.data;
    }

}
