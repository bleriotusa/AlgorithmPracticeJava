package WellFormedString;

import java.util.*;

/**
 * EPI isWellFormedString
 */
public class WellFormedString {

    /**
     * Create a stack that holds all the left symbols. When a right symbol is processed, it can remove it's corresponding
     * left symbol from the top.
     *
     * If we hit a right symbol when it's left is not on top of the stack (or empty),
     *  we're out of order and we return false.
     *
     * At the end if the stack is empty, that means we had just enough rights to cover all the lefts,
     *  and we got this far so that means we have good order and balanced pairs, so we return true.
     *
     * @param string of brackets, braces, and parentheses
     * @return true if the string is a well formed string of brackets, braces, and parentheses
     */
    public static boolean isWellFormed(String string) {
        Deque<Character> symbols = new ArrayDeque<>();
        Map<Character, Character> symbolMap = new HashMap<>();

        symbolMap.put('}', '{');
        symbolMap.put(')', '(');
        symbolMap.put(']', '[');


        char currChar;
        for (int i = 0; i < string.length(); i++) {
            currChar = string.charAt(i);

            if (currChar == '(' || currChar == '{' || currChar == '[')
                symbols.addFirst(currChar);

            else {
                if(symbols.isEmpty())
                    return false;
                else if (symbols.peekFirst() != symbolMap.get(currChar))
                    return false;
                else
                    symbols.removeFirst();
            }

        }

        return symbols.isEmpty();
    }
}
