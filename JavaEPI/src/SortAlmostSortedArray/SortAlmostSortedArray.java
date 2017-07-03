package SortAlmostSortedArray;

import java.util.*;

/**
 * Created by Michael on 6/25/17.
 *
 * Given a sequence of integers, where each integer is at most k away from it's sorted position,
 * write a function that returns the sequence in the sorted order (original problem has us print the value)
 */
class SortAlmostSortedArray {

    /**
     * Given a sequence of integers, where each integer is at most k away from it's sorted position,
     * write a function that returns the sequence in the sorted order (original problem has us print the value)
     *
     * [3, 1, 2, 4, 15, 6, 9, 11] --> [1, 2, 3, 4, 6, 9, 11, 15]
     * @param sequence list of integers that are at most k spaces away from their sorted positions
     * @param k: number of spaces that an unsorted element can be from it's sorted position
     */
     static List<Integer> sortAlmostSortedArray(Iterator<Integer> sequence, int k){
        List<Integer> sortedArray = new ArrayList<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>(k);



        // iterate through the sequence, and then iterate through the rest of the heap once we're done with sequence
        while(sequence.hasNext() || !heap.isEmpty()) {

            if (sequence.hasNext())
                heap.add(sequence.next());

            System.out.println(Arrays.toString(heap.toArray()));

            // Once the heap is filled to size k, that means any number that was k away from it's sorted
            // position should be back into sorted position once it's pulled out of the heap.
            //
            // Therefore, pull out of the heap and add to the sorted list.
            //
            // Empty the heap out once we finish the sequence
            //
            if(heap.size() == k || !sequence.hasNext())
                sortedArray.add(heap.remove());

        }

        return sortedArray;
    }
}
