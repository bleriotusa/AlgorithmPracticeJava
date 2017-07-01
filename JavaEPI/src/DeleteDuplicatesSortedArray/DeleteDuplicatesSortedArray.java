package DeleteDuplicatesSortedArray;

/**
 * Created by MichaelLeisure on 6/30/17.
 */
public class DeleteDuplicatesSortedArray {

    /**
     * Traverse the list and:
     * 1. Swap the current index with the spot to move to
     * 2. Increment the spot if the spot to move to isn't the same as previous
     */
    protected static int[] deleteDuplicatesSortedArray(int[] sortedArray) {
        int invalidIndex = 1;

        /* Traverse the list */
        for (int i = 1; i < sortedArray.length; i++) {

            /* 1. Swap current index with the invalid spot. Spot is invalid if it is a duplicate of it's
             *       previous element
             */
            if (i != invalidIndex) {
                // swap current index element with invalidIndex element
                int temp = sortedArray[i];
                sortedArray[i] = sortedArray[invalidIndex];
                sortedArray[invalidIndex] = temp;
            }

            /* 2. Check that the valid list is still valid after swap (i.e no duplicates in the "valid" section)
             *      If not valid, keep the invalid index where it is
             *      Else move up the invalid index out of the valid list
             */
            if (sortedArray[invalidIndex] != sortedArray[invalidIndex - 1])
                invalidIndex++;


        }


        return sortedArray;
    }
}
