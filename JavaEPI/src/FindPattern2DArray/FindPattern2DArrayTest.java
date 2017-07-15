package FindPattern2DArray;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import static FindPattern2DArray.FindPattern2DArray.findPattern2DArray;
/**
 * Created by bleri on 7/15/2017.
 */
class FindPattern2DArrayTest {
    @Test
    void findPattern2DArrayTest() {
        int[][] matrix = {{2, 4, 6}, {3, 7, 2}, {7, 3, 1}};
        List<Integer> pattern = new ArrayList<>();
        pattern.add(1);
        pattern.add(3);
        pattern.add(7);

        assertTrue(findPattern2DArray(pattern, matrix));
    }

    @Test
    void findPattern2DArrayTest2() {
        int[][] matrix = {{2, 4, 6}, {3, 7, 2}, {7, 3, 1}};
        List<Integer> pattern = new ArrayList<>();
        pattern.add(1);
        pattern.add(3);
        pattern.add(2);

        assertFalse(findPattern2DArray(pattern, matrix));
    }

    @Test
    void findPattern2DArrayTest3() {
        int[][] matrix = {{2}, {3}, {7}};
        List<Integer> pattern = new ArrayList<>();
        pattern.add(2);
        pattern.add(3);
        pattern.add(7);

        assertTrue(findPattern2DArray(pattern, matrix));
    }

}