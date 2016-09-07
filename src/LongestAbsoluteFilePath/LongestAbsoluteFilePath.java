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
        int max = 0;
        int curr = 0;

        char previous = input.charAt(0), current;


        for(int i = 0; i < input.length(); i++) {
            current = input.charAt(i);

            // if it turns out we are at a return, don't count the slash
            if(isReturn(previous, current)) {
                current--;
                if(current > max ) {
                    max = current;
                }
            }

            else {
                current++;
            }

            previous = current;
        }

        return max;
    }

    public boolean isReturn(char previous, char current) {
        return previous == '\\' && current == 'n';
    }

    public boolean isTab(char previous, char current) {
        return previous == '\\' && current == 't';
    }

}
