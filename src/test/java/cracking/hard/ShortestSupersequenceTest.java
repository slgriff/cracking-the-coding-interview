package cracking.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestSupersequenceTest {

    @Test
    public void test() {
        int[] expected = {7, 10};

        int[] shorter = {1, 5, 9};
        int[] longer = {7, 5, 9, 0, 2, 1, 3, 5, 7, 9, 1, 1, 5, 8, 8, 9, 7};
        int[] actual = ShortestSupersequence.solve(shorter, longer);

        assertArrayEquals(expected, actual);
    }

}