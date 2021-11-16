package cracking.arraysstrings;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ZeroMatrixTest {

    @Test
    public void test1() {
        int[][] expected = {
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };

        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        ZeroMatrix.zeroMatrix(matrix);

        assertTrue(Arrays.deepEquals(expected, matrix));
    }

    @Test
    public void test2() {
        int[][] expected = {
                {0, 0, 0, 0},
                {0, 4, 5, 0},
                {0, 3, 1, 0}
        };

        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };

        ZeroMatrix.zeroMatrix(matrix);

        assertTrue(Arrays.deepEquals(expected, matrix));
    }

}