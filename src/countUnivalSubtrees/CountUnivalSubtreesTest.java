package countUnivalSubtrees;

import common.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static countUnivalSubtrees.CountUnivalSubtrees.*;
import static org.junit.Assert.*;

/**
 * Created by Michael on 4/7/2016.
 */
public class CountUnivalSubtreesTest {
    TreeNode tree0;
    TreeNode tree1;
    TreeNode tree2;
    TreeNode tree2_1;
    TreeNode tree3;
    TreeNode tree3_1;
    TreeNode tree4;
    TreeNode tree4_1;


    @Test
    public void countUnivalSubtreesTest() throws Exception {
        assertEquals(0, countUnivalSubtrees(tree0));
        assertEquals(0, countUnivalSubtrees(tree1));
        assertEquals(1, countUnivalSubtrees(tree2_1));
        assertEquals(2, countUnivalSubtrees(tree3_1));
        assertEquals(1, countUnivalSubtrees(tree4));

    }

    @Test
    public void isUnivalTreeTest() throws Exception {
        assertFalse(isUnivalTree(tree0));
        assertFalse(isUnivalTree(tree1));
        assertFalse(isUnivalTree(tree2));
        assertTrue(isUnivalTree(tree2_1));
        assertFalse(isUnivalTree(tree3));
        assertTrue(isUnivalTree(tree3_1));
        assertFalse(isUnivalTree(tree4));
    }

    @Before
    public void setUp() throws Exception {
        tree4 = new TreeNode(25, new TreeNode(50, new TreeNode(50)), new TreeNode(50));
        tree1 = new TreeNode(50);
        tree0 = null;
        tree2 = new TreeNode(50, new TreeNode(25));
        tree2_1 = new TreeNode(50, new TreeNode(50));
        tree3 = new TreeNode(50, new TreeNode(25, new TreeNode(50)));
        tree3_1 = new TreeNode(50, new TreeNode(50, new TreeNode(50)));
    }
}