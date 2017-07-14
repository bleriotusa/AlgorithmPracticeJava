package WellFormedString;

import org.junit.jupiter.api.Test;

import static WellFormedString.WellFormedString.isWellFormed;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by bleri on 7/13/2017.
 */
class WellFormedStringTest {
    @Test
    void wellFormedTest() {
        String test = "[]{()()}";
        assertTrue(isWellFormed(test));
    }

    @Test
    void wellFormedTest2() {
        String test = "[]{()()}{";
        assertFalse(isWellFormed(test));
    }

    @Test
    void wellFormedTest3() {
        String test = "[]{()()}}";
        assertFalse(isWellFormed(test));
    }

    @Test
    void wellFormedTest4() {
        String test = "([[{]]})";
        assertFalse(isWellFormed(test));
    }

    @Test
    void wellFormedTest5() {
        String test = "[()[]{()()}]";
        assertTrue(isWellFormed(test));
    }

    @Test
    void wellFormedTest6() {
        String test = "[()[]{()()";
        assertFalse(isWellFormed(test));
    }

}