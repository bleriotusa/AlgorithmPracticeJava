package LongestAbsoluteFilePath;

import java.util.Stack;

/**
 * Created by Michael on 9/6/2016.
 */
public class LongestAbsoluteFilePath {
    Stack<Integer> stack;

    public LongestAbsoluteFilePath() {
        stack = new Stack<>();
    }

    /**
     * Dynamic Programming approach using stack for each level (indent)
     * @param input
     * @return
     */
    public int lengthLongestPath(String input) {
        int maxLength = 0;
        int currLength = 0;
        int currentTabCount = 0;
        int currentReturnCount = 0;

        char current;


        for(int i = 0; i < input.length(); i++) {
            current = input.charAt(i);

            // if it turns out we are at a return,
            //      don't update current length
            //      update return and tab counts
            //      if wasn't a file, don't update count
            //      check if we're at root level (if so, reset current length)
            if(isReturn(current)) {
                // increase return count
                currentReturnCount++;

                int currPos = i;
                boolean hadTab = true;
                // do a lookahead to see if any tabs
                //      make sure string has room for a tab
                while(i < input.length()-1 && hadTab) {
                    hadTab = false;
                    char next = input.charAt(currPos+1);
                    currPos += 2;

                    if(isTab(next)) {
                        currentTabCount++;
                        hadTab = true;
                    }
                }

                // check if we're back to root level
                // if so, reset current length
                if(currentTabCount == currentReturnCount)
                    currLength = 0;

                if(currLength > maxLength ) {
                    maxLength = currLength;
                }
            }

            else {
                currLength++;
            }

            maxLength = (currLength > maxLength)? currLength : maxLength;
        }

        return maxLength;
    }

    public boolean isReturn(char character) {
        return character == '\n';
    }

    public boolean isTab(char character) {
        return character == '\t';
    }

}
