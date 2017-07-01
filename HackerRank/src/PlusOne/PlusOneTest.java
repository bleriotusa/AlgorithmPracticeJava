package PlusOne;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Michael on 6/13/2016.
 */
public class PlusOneTest {
    @Test
    public void plusOne() throws Exception {
        ArrayList<int[]> problemSolutions = new ArrayList<>();

        int[] x1 = {1,2,3};
        int[] sol1 = {1,2,4};
        int[] x2 = {1,2,9};
        int[] sol2 = {1,3,0};
        int[] x3 = {9,9,9};
        int[] sol3 = {1,0,0,0};
        int[] x4 = {9,8,9};
        int[] sol4 = {9,9,0};
        problemSolutions.addAll(Arrays.asList(x1, sol1, x2, sol2, x3, sol3, x4, sol4));

        // run through all the problems
        for(int j = 0; j < problemSolutions.size(); j+=2) {
            int[] answer = PlusOne.plusOne(problemSolutions.get(j));
            for (int i = 0; i < answer.length; i++) {
                System.out.println(String.format("%d: Sol = %d, Ans = %d", i, problemSolutions.get(j+1)[i], answer[i]));
                assertEquals(problemSolutions.get(j+1)[i], answer[i]);
            }
            System.out.println("\n");
        }
    }

}