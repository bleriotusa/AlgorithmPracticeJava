package DeleteDuplicatesSortedArray;
import static DeleteDuplicatesSortedArray.DeleteDuplicatesSortedArray.deleteDuplicatesSortedArray;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by MichaelLeisure on 6/30/17.
 */
public class DeleteDuplicatesSortedArrayTest {
    @Test
    public void deleteDuplicatesSortedArrayTest() throws Exception {

        int[] test1 = new int[]{1, 2, 2, 3, 8, 8, 8, 10};
        int[] solution1 = new int[]{1, 2, 3, 8, 10};

        /**
         * {1, 2*, 2, 3, 8, 8, 8, 10}
         * {1, 2, 2*, 3, 8, 8, 8, 10}
         * {1, 2, 3, 2*, 8, 8, 8, 10}
         * {1, 2, 3, 8, 2*, 8, 8, 10}
         * {1, 2, 3, 8, 8*, 2, 8, 10}
         * {1, 2, 3, 8, 8*, 2, 8, 10}
         * {1, 2, 3, 8, 10, 2*, 8, 8}
         */
        for(Integer i: Arrays.copyOfRange(deleteDuplicatesSortedArray(test1), 0, 5)) {
            System.out.print(i + " ");
        }

        assertArrayEquals(Arrays.copyOfRange(deleteDuplicatesSortedArray(test1), 0, 5), solution1);

        System.out.println("");
    }

    @Test
    public void deleteDuplicatesSortedArrayTest2() throws Exception {

        int[] test2 = new int[]{2, 3, 5, 5, 7, 11, 11, 11, 13};
        int[] solution2 = new int[]{2, 3, 5, 7, 11, 13};

        for(Integer i: Arrays.copyOfRange(deleteDuplicatesSortedArray(test2), 0, 5)) {
            System.out.print(i + " ");
        }

        assertArrayEquals(Arrays.copyOfRange(deleteDuplicatesSortedArray(test2), 0, 6), solution2);


        System.out.println("");
    }
}