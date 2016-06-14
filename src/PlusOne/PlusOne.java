package PlusOne;

import java.util.ListIterator;

/**
 * Created by Michael on 6/13/2016.
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {

        if(digits[digits.length-1] == 9)
            carry(digits);

        digits[digits.length-1]++;


        return digits;

    }

    /**
     * Shifts digits to the right one and adds a 1 to the front
     * @param digits Array to shift digits in
     */
    public static void shiftArray(int[] digits) {
        for(int i = digits.length-1; i >= 0; i--)  {
            digits[i+1] = digits[i];
        }
        digits[0] = 1;
    }

    public static void carry(int[] digits) {
        int curr = 0;
        boolean carry = false;
        // iterate through the list in reverse order
        for(int i = digits.length-1; i >= 0; i--) {
            curr = digits[i];
            // for each number, add one to it, passing up the digit if overflow
            if(curr == 9) {
                digits[i] = 0;
                carry = true;
            }
            else
                digits[i]++;

            if(carry) {
                // if we're at the most significant digit, move everything over and add a one
                shiftArray(digits);

            }
        }
    }
}
