package LongestSubstringKDistinct;

import LongestSubstringKDistinct.LongestSubstringKDistinct;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Michael on 4/16/2016.
 */
public class LongestSubstringKDistinctTest {
    String test0 = "a";
    String test1 = "abaca";
    String test2 = "aaaaaebeaaaaaaaa";
    String test3 = "eceba";
    String test4 = "abcabcabc";
    String test5 = "abccbbcccaaacaca";
    String test6 = "ababcbcbaaabbdef";
    LongestSubstringKDistinct tester;

    @Before
    public void setUp() throws Exception {
        tester = new LongestSubstringKDistinct();
    }

    @Test
    public void testLengthOfLongestSubstringKDistinctKequals2() throws Exception {
        assertEquals(3, tester.lengthOfLongestSubstringKDistinct(test1, 2));
        assertEquals(9, tester.lengthOfLongestSubstringKDistinct(test2, 2));
        assertEquals(3, tester.lengthOfLongestSubstringKDistinct(test3, 2));
        assertEquals(2, tester.lengthOfLongestSubstringKDistinct(test4, 2));
        assertEquals(10, tester.lengthOfLongestSubstringKDistinct(test5, 2));
        assertEquals(6, tester.lengthOfLongestSubstringKDistinct(test6, 2));

    }

    @Test
    public void testLengthOfLongestSubstringKDistinctKequals3() throws Exception {
        assertEquals(0, tester.lengthOfLongestSubstringKDistinct(test0, 0));
        assertEquals(5, tester.lengthOfLongestSubstringKDistinct(test1, 3));
        assertEquals(test2.length(), tester.lengthOfLongestSubstringKDistinct(test2, 3));
        assertEquals(4, tester.lengthOfLongestSubstringKDistinct(test3, 3));
        assertEquals(test4.length(), tester.lengthOfLongestSubstringKDistinct(test4, 3));
        assertEquals(test5.length(), tester.lengthOfLongestSubstringKDistinct(test5, 3));
        assertEquals(test6.length() - 3, tester.lengthOfLongestSubstringKDistinct(test6, 3));

    }

}