package SummaryRanges;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael on 4/23/2016.
 * <p>
 * Given a sorted integer array without duplicates, return the summary of its ranges.
 * <p>
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 */
public class SummaryRanges {

    List<String> summaries;
    int beg, end, next;

    /**
     * @param nums: a list of sorted integers
     * @return a list of strings that represent ranges throughout the list
     */

    public List<String> summaryRanges(int[] nums) {

        summaries = new ArrayList<>();

        // take care of empty case
        if (nums.length == 0)
            return summaries;

        // intialize variables
        beg = end = nums[0];

        // run algorithm
        for (int i = 0; i < nums.length; i++) {

            // if this is the last number, report it
            if (i + 1 >= nums.length) {
                addToReport();
                break;
            }

            next = nums[i + 1];

            // if numbers will be still consecutive, just update the end of the range
            if (next == end + 1)
                end = next;

                // if not report summary
            else
                addToReport();
        }


        return summaries;
    }

    /**
     * 1. Add current range summary to answer list (checking if it's a single number range)
     * 2. Reset beg and end variables to next
     */
    public void addToReport() {
        if (beg != end)
            summaries.add(String.format("%d->%d", beg, end));
        else
            summaries.add(String.format("%d", beg));

        beg = end = next;
    }
}
