package BedBathBeyond;

import java.util.Iterator;
import java.util.Set;

/**
 * Given a set of words (dictionary), determine if a given name (string) is a concatenation of the set.
 */
public class BedBathBeyond {

    static boolean isConcatenation(Set<String> dict, String name) {
        if (dict.isEmpty()) {
            return false;
        }

        Iterator<String> dictIterator = dict.iterator();

        while (dictIterator.hasNext()) {
            String first = dictIterator.next();
            // first word is same length as name
            if (name.length() <= first.length())
                return name.equals(first);

            if (name.substring(0, first.length()).equals(first)) {
                return isConcatenation(dict, name.substring(first.length(), name.length()));
            }
        }

        return false;
    }
}
