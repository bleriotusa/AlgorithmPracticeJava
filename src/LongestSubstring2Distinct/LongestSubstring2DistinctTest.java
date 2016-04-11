package LongestSubstring2Distinct;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Home on 4/10/16.
 */
public class LongestSubstring2DistinctTest {
    String test1 = "aaaaaebeaaaaaaaa";
    String test2 = "aaaaaebeaaaaaaaa"
    LongestSubstring2Distinct tester;

    @Before
    public void setUp() throws Exception {
         tester = new LongestSubstring2Distinct();
    }

    @Test
    public void testLengthOfLongestSubstringTwoDistinct() throws Exception {
        assertEquals(3, tester.lengthOfLongestSubstringTwoDistinct(test1));
    }

}