package BedBathBeyond;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

import static BedBathBeyond.BedBathBeyond.isConcatenation;
/**
 * Created by MichaelLeisure on 7/15/17.
 */
class BedBathBeyondTest {
    @Test
    void isConcatenationTest() {
        Set<String> testSet = new HashSet<>(Arrays.asList(new String[]{"hello", "there", ".com", "legend", "person"}));
        String name = "hellothere.com";

        assertTrue(isConcatenation(testSet, name));
    }

    @Test
    void isConcatenationTest2() {
        Set<String> testSet = new HashSet<>(Arrays.asList(new String[]{"hello", "there", ".com", "legend", "person"}));
        String name = "hellotherecom";

        assertFalse(isConcatenation(testSet, name));
    }

}