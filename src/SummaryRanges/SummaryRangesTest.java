package SummaryRanges;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Michael on 4/23/2016.
 */
public class SummaryRangesTest {
    SummaryRanges tester;
    int[] test0 = {};
    int[] test1 = {1,2,3,5,6};
    int[] test2 = {1,2,3,5};
    int[] test3 = {5};
    int[] test4 = {1,3};


    List<String> ans0 = new ArrayList<String>();
    List<String> ans1 = new ArrayList<String>();
    List<String> ans2 = new ArrayList<String>();
    List<String> ans3 = new ArrayList<String>();
    List<String> ans4 = new ArrayList<String>();




    @Before
    public void setUp() throws Exception {
        tester = new SummaryRanges();

        ans1.add("1->3");
        ans1.add("5->6");
        ans2.add("1->3");
        ans2.add("5");
        ans3.add("5");
        ans4.add("1");
        ans4.add("3");
    }

    @Test
    public void summaryRangesTest() throws Exception {
        assertEquals(ans0, tester.summaryRanges(test0));
        assertEquals(ans1, tester.summaryRanges(test1));
        assertEquals(ans2, tester.summaryRanges(test2));
        assertEquals(ans3, tester.summaryRanges(test3));
        assertEquals(ans4, tester.summaryRanges(test4));

    }

}