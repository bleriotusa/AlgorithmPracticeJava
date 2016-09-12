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
        System.out.println("12345".lastIndexOf("1"));
        System.out.println("12345".lastIndexOf("7"));

        String test0 = "";
        String test1 = "hello";
        String test2 = "hello.ext";
        String test3 = "hello\nhellos";
        String test4 = "hello\nhellos.ex";
        String test5 = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        String test6 = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";

        assertEquals(0, tester.lengthLongestPath(test0));
        assertEquals(0, tester.lengthLongestPath(test1));
        assertEquals(9, tester.lengthLongestPath(test2));
        assertEquals(0, tester.lengthLongestPath(test3));
        assertEquals(9, tester.lengthLongestPath(test4));
        assertEquals(20, tester.lengthLongestPath(test5));
        assertEquals(32, tester.lengthLongestPath(test6));


    }

}