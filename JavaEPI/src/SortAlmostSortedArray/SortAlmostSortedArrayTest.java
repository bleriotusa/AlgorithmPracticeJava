package SortAlmostSortedArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;


import static SortAlmostSortedArray.SortAlmostSortedArray.sortAlmostSortedArray;

/**
 * Created by MichaelLeisure on 6/25/17.
 */
public class SortAlmostSortedArrayTest {
    public static List<Integer> arrayToList(int[] array) {
        List<Integer> l = new ArrayList<>(array.length);
        for(Integer num: array)
            l.add(num);
        return l;
    }

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.Test
    public void sortAlmostSortedArrayTest() throws Exception {
//        List<Integer> sequence = Stream.of(3, 1, 2, 4, 15, 6, 9, 11).collect(Collectors.toList());
        int[] sequence1 = new int[]{3, 1, 2, 4, 15, 6, 9, 11};
        List<Integer> seqList1 = arrayToList(sequence1);

        int[] solution1 = new int[]{1, 2, 3, 4, 6, 9, 11, 15};
        List<Integer> solList1 = arrayToList(solution1);


        for(Integer num: sortAlmostSortedArray(seqList1.iterator(), 3))
            System.out.print(num + " ");

        assertEquals(sortAlmostSortedArray(seqList1.iterator(), 3), solList1);

        System.out.println("");
    }

    @org.junit.Test
    public void sortAlmostSortedArrayTest2() throws Exception {
        int k = 2;
        int[] sequence1 = new int[]{3, -1, 2, 6, 4, 5, 8};
        List<Integer> seqList1 = arrayToList(sequence1);

        int[] solution1 = new int[]{-1, 2, 3, 4, 5, 6, 8};
        List<Integer> solList1 = arrayToList(solution1);


        for(Integer num: sortAlmostSortedArray(seqList1.iterator(), k))
            System.out.print(num + " ");

        assertEquals(sortAlmostSortedArray(seqList1.iterator(), k), solList1);

        System.out.println("");
    }

}