package PlusOne;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Michael on 6/13/2016.
 */
public class PlusOneTest {
    @Test
    public void plusOne() throws Exception {
        int[] x = {1,2,3};
        int[] solution = {1,2,4};
        int[] answer = PlusOne.plusOne(x);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(String.format("%d: Sol = %d, Ans = %d", i, solution[i], answer[i]));
            assertEquals(solution[i], answer[i]);
        }
    }

}