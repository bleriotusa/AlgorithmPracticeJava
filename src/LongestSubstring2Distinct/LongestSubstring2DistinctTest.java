package LongestSubstring2Distinct;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Home on 4/10/16.
 */
public class LongestSubstring2DistinctTest {
    String test1 = "abaca";
    String test2 = "aaaaaebeaaaaaaaa";
    String test3 = "eceba";
    String test4 = "abcabcabc";
    LongestSubstring2Distinct tester;

    @Before
    public void setUp() throws Exception {
         tester = new LongestSubstring2Distinct();
    }

    @Test
    public void testLengthOfLongestSubstringTwoDistinct() throws Exception {
        assertEquals(3, tester.lengthOfLongestSubstringTwoDistinct(test1));
        assertEquals(9, tester.lengthOfLongestSubstringTwoDistinct(test2));
        assertEquals(3, tester.lengthOfLongestSubstringTwoDistinct(test3));
        assertEquals(2, tester.lengthOfLongestSubstringTwoDistinct(test4));




    }

}