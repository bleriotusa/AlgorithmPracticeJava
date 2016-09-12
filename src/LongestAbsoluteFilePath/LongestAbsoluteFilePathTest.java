package LongestAbsoluteFilePath;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Michael on 9/11/2016.
 */
public class LongestAbsoluteFilePathTest {
    LongestAbsoluteFilePath tester;

    @Before
    public void setUp() {
        tester = new LongestAbsoluteFilePath();

    }
    @Test
    public void lengthLongestPath() throws Exception {
        String test0 = "";
        String test1 = "hello";

        assertEquals(5, tester.lengthLongestPath(test1));

    }

    @Test
    public void isReturn() throws Exception {
        String test = "hello\n";
        System.out.print(test.charAt(5));
        System.out.print("hi");
        assertTrue(tester.isReturn(test.charAt(5)));
        assertFalse(tester.isReturn('n'));

    }

    @Test
    public void isTab() throws Exception {
        String test = "hello\t";
        System.out.print(test.charAt(5));
        System.out.print("hi");
        assertTrue(tester.isTab(test.charAt(5)));
        assertFalse(tester.isTab('n'));
    }

}