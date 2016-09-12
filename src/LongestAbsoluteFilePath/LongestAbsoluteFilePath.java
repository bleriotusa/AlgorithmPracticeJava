package LongestAbsoluteFilePath;

import java.util.Stack;

/**
 * Created by Michael Chen (bleriotusa@gmail.com) on 9/6/2016.
 */
public class LongestAbsoluteFilePath {

    /**
     * Dynamic Programming approach using stack for each level (indent)
     * Uses a running total length that resets whenever we go up a directory level, using the stack.
     *
     * @param input: String that represents a directory hierarchy, including files.
     * @return Number of characters that the longest file path has
     */
    public int lengthLongestPath(String input) {
        Stack<Integer> stack = new Stack<>();
        int maxLength = 0;
        int currLength = 0;
        int currentLevel;
        int previousLevel;
        String directoryStripped;

        /*
         * 1. Split chunks into folders and files
         * 2. Use a stack to keep track of directory levels and the length of that word.
         *      Could use array, but since each directory can only go down one level at a time,
         *      we can use a stack.
         * 3. For every word,
         *      add it's length to the directory level
         *      add it's length to the current length
         *      update maximum length
         */
        for (String directory : input.split("\n")) {

            // pop the amount of levels we went down, if any,
            // and subtract those levels from current count.
            //  + 1 pop to reset the count for that directory level
            currentLevel = directory.lastIndexOf('\t') + 2;
            previousLevel = stack.size();
            for (int i = 0; i < previousLevel - currentLevel + 1; i++) {
                if (!stack.isEmpty())
                    currLength -= stack.pop();
            }

            // push the current level on stack.
            //  used to keep track of length on this directory level, in case we need to backtrack.
            //  this helps us to update the "current length" accurately
            directoryStripped = directory.replaceAll("[\t]+", "/");
            stack.push(directoryStripped.length());

            // add the current directory length to the running total
            currLength += directoryStripped.length();

            // if the running total is a file, and is greater than current max, update the maximum length
            maxLength = (currLength > maxLength && directoryStripped.contains(".")) ? currLength : maxLength;

        }

        return maxLength;
    }
}
