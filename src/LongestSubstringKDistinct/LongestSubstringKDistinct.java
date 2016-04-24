package LongestSubstringKDistinct;

import java.util.*;

/**
 * Created by Michael J Chen on 4/10/16. **UNFINISHED**
 * <p>
 * <p>
 * Given a string, find the length of the longest substring T that contains at most 2 distinct characters.
 * <p>
 * For example, Given s = “eceba”,
 * <p>
 * T is "ece" which its length is 3.
 */
public class LongestSubstringKDistinct {
    Map<Character, Integer> map;
    Set<Character> queue;
    char previous;

    /**
     * Return the length of the longest substring that has only two distinct characters.
     * <p>
     * Idea is to process the string, keeping track of two things:
     * 1. Map: Number of consecutive repeats each character has.
     * 2. FIFO Set: The order in which unique characters are processed.
     * <p>
     * We can start by keeping a running total of two distinct characters.
     * When we get to a 3rd one, we can reset the counter to only the previous characters' consecutive count
     * using the map and then delete the first unique character in the FIFO set from the map to reset the counts.
     * <p>
     * This way, we can implement a psuedo sliding window without having to backtrack the processing character.
     *
     * @param s: string to find the longest substring for
     * @param k: number of distinct characters allowed in the substring
     * @return length of the longest substring that has only k unique characters.
     */
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(k == 0)
            return 0;

        map = new LinkedHashMap<>();
        queue = new LinkedHashSet<>();
        int current = 0;
        int max = 0;

        // Iterate through the string
        for (char c : s.toCharArray()) {
            // if we already have this character, allow it and add to the counter
            // capture a consecutive running total of each character
            if (map.keySet().contains(c)) {
                if (c == previous)
                    map.put(c, map.get(c) + 1);
                else
                    map.put(c, 1);
                current++;
                max = (current > max) ? current : max;
            }

            // Two cases if we don't already have this character:
            // 1. If we have room, add this to the list of characters and update it's running total to 1
            // 2. Otherwise, reset total count to sum of character's consecutives without oldest character,
            //      take the oldest character in the queue out of the map,
            //      and add the newest character in with a running total of 1
            else {
                if (map.size() < k) {
                    map.put(c, 1);
                    current++;
                    max = (current > max) ? current : max;
                } else {
                    map.remove(queue.iterator().next());
                    current =  map.values().stream().mapToInt(Integer::intValue).sum() + 1;
                    max = (current > max) ? current : max;
                    map.put(c, 1);

                }
            }
            previous = c;

            // to compute the character we need to take out of the map next, we keep a queue of unique characters
            // FIFO queue of unique characters
            if (queue.contains(c))
                queue.remove(c);

            queue.add(c);

            if (queue.size() > k)
                queue.remove(queue.iterator().next());
        }

        return max;
    }
}

