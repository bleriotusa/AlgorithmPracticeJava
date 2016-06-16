package PlusOne;

import java.util.Arrays;
import java.util.ListIterator;

/**
 * Created by Michael on 6/13/2016.
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {

        if(digits[digits.length-1] == 9)
            digits = carry(digits);
        else
            digits[digits.length-1]++;


        return digits;

    }

    /**
     * Shifts digits to the right one and adds a 1 to the front
     * @param digits Array to shift digits in
     */
    public static int[] shiftArray(int[] digits) {
        int[] newArray = Arrays.copyOf(digits, digits.length + 1);
        for(int i = digits.length-1; i >= 0; i--)  {
            newArray[i+1] = digits[i];
        }
        newArray[0] = 1;
        return newArray;
    }

    public static int[] carry(int[] digits) {
        int curr = 0;
        boolean carry = true;
        // iterate through the list in reverse order
        for(int i = digits.length-1; i >= 0 && carry; i--) {
            carry = false;
            curr = digits[i];
            // for each number, add one to it, passing up the digit if overflow
            if(curr == 9) {
                digits[i] = 0;
                carry = true;
            }
            else
                digits[i]++;

            // if we're at the most significant digit, move everything over and add a one
            if(carry && i==0) {
                digits = shiftArray(digits);

            }
        }
        return digits;
    }
}
