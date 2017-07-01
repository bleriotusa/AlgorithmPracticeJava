package countUnivalSubtrees;

import common.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Michael on 4/7/2016.
 */
public class CountUnivalSubtreesTest {
    CountUnivalSubtrees counter;
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
        long startTime = System.nanoTime();
        assertEquals(0, counter.countUnivalSubtrees(tree0));
        assertEquals(1, counter.countUnivalSubtrees(tree1));
        assertEquals(2, counter.countUnivalSubtrees(tree2_1));
        assertEquals(3, counter.countUnivalSubtrees(tree3_1));
        assertEquals(3, counter.countUnivalSubtrees(tree4));
        System.out.println(System.nanoTime()-startTime);
    }

    @Test
    public void isUnivalTreeTest() throws Exception {
        assertFalse(counter.isUnivalTree(tree0));
        assertTrue(counter.isUnivalTree(tree1));
        assertFalse(counter.isUnivalTree(tree2));
        assertTrue(counter.isUnivalTree(tree2_1));
        assertFalse(counter.isUnivalTree(tree3));
        assertTrue(counter.isUnivalTree(tree3_1));
        assertFalse(counter.isUnivalTree(tree4));
    }

    @Before
    public void setUp() throws Exception {
        counter = new CountUnivalSubtrees();
        tree4 = new TreeNode(25, new TreeNode(50, new TreeNode(50)), new TreeNode(50));
        tree1 = new TreeNode(50);
        tree0 = null;
        tree2 = new TreeNode(50, new TreeNode(25));
        tree2_1 = new TreeNode(50, new TreeNode(50));
        tree3 = new TreeNode(50, new TreeNode(25, new TreeNode(50)));
        tree3_1 = new TreeNode(50, new TreeNode(50, new TreeNode(50)));
    }
}