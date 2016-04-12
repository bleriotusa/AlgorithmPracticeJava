package LongestSubstring2Distinct;

import java.util.*;

/**
 * Created by Michael J Chen on 4/10/16.
 *

 Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

 For example, Given s = “eceba”,

 T is "ece" which its length is 3.
 */
public class LongestSubstring2Distinct {
    Map<Character, Integer> map;
    Deque<Character> queue;
    char previous;

    /**
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        map = new LinkedHashMap<>();
        queue = new LinkedList<>();
        int current = 0;
        int max = 0;

        for(char c : s.toCharArray()) {
            if(map.keySet().contains(c)) {
                if(c == previous)
                    map.put(c, map.get(c)+1);
                else
                    map.put(c, 1);
                current++;
                max = (current > max)? current : max;
            }

            else {
                if(map.size() < 2) {
                    map.put(c, 1);
                    current++;
                    max = (current > max)? current : max;
                }
                else {
                    current = map.get(previous) + 1;
                    max = (current > max)? current : max;
                    map.remove(queue.peekFirst());
                    map.put(c, 1);

                }
            }
            previous = c;
            if(queue.size() == 2)
                queue.removeFirst();
            queue.add(c);
        }

        return max;
    }

}
