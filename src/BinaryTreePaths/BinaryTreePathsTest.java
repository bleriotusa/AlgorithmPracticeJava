package BinaryTreePaths;

import common.TreeNode;
import org.junit.Before;

import java.util.Stack;

import static org.junit.Assert.*;

/**
 * Created by Home on 3/19/16.
 */
public class BinaryTreePathsTest {

    @Before
    public void setUp() throws Exception {


    }

    @org.junit.Test
    public void testPathToString() throws Exception {
        Stack<TreeNode> s = new Stack<>();
        System.out.println(BinaryTreePaths.pathToString(s));
        assertEquals("", BinaryTreePaths.pathToString(s));

        s.push(new TreeNode(5));
        System.out.println(BinaryTreePaths.pathToString(s));
        assertEquals("5", BinaryTreePaths.pathToString(s));

        s.push(new TreeNode(6));
        System.out.println(BinaryTreePaths.pathToString(s));
        assertEquals("5->6", BinaryTreePaths.pathToString(s));

        s.push(new TreeNode(7));

        System.out.println(BinaryTreePaths.pathToString(s));
        assertEquals("5->6->7", BinaryTreePaths.pathToString(s));
    }
}