package PlusOne;

import java.util.Arrays;

/**
 * LeetCode's PlusOne problem. Given an int array representing an integer, add one to it and return.
 * Created by Michael on 6/13/2016.
 */
public class PlusOne {

    /**
     * Algorithm:
     * 1. Iterate from right (least significant digit) to left, if need to carry.
     * 2. Condition to carry is if current digit is 9 before adding 1.
     * 3. If most significant digit also needs a carry, we need to shift all digits to the right and insert a 1 as MSD
     *
     * @param digits is the array representation of integer to add the number 1 to.
     * @return array representation of integer after adding the number 1.
     */
    public static int[] plusOne(int[] digits) {

        int curr = 0;
        boolean carry = true;
        // iterate through the list in reverse order
        for (int i = digits.length - 1; i >= 0 && carry; i--) {
            carry = false;
            curr = digits[i];
            // for each number, add one to it, passing up the digit if overflow
            if (curr == 9) {
                digits[i] = 0;
                carry = true;
            } else
                digits[i]++;

            // if we're at the most significant digit, move everything over and add a one
            if (carry && i == 0) {
                digits = shiftArray(digits);

            }
        }
        return digits;
    }

    /**
     * Shifts digits to the right one and adds a 1 to the front
     *
     * @param digits Array to shift digits in
     */
    public static int[] shiftArray(int[] digits) {
        int[] newArray = Arrays.copyOf(digits, digits.length + 1);
        for (int i = digits.length - 1; i >= 0; i--) {
            newArray[i + 1] = digits[i];
        }
        newArray[0] = 1;
        return newArray;
    }

}
