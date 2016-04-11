package LongestSubstring2Distinct;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Michael J Chen on 4/10/16.
 *

 Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

 For example, Given s = “eceba”,

 T is "ece" which its length is 3.
 */
public class LongestSubstring2Distinct {
    Set<Character> set = new LinkedHashSet<>();

    /**
     *
     * @param s
     * @return
     */
    public  int lengthOfLongestSubstringTwoDistinct(String s) {
        int current = 0;
        int max = 0;

        for(char c : s.toCharArray()) {
            if(set.contains(c)) {
                current++;
                max = (current > max)? current : max;
            }

            else {
                if(set.size() < 2) {
                    set.add(c);
                    current++;
                    max = (current > max)? current : max;
                }
                else {
                }
            }
        }

        return 0;
    }

}
