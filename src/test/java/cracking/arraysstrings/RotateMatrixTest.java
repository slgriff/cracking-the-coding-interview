package cracking.arraysstrings;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RotateMatrixTest {

    @Test
    public void test1() {
        int[][] expected = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] actual = RotateMatrix.rotate(matrix);

        assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    public void test2() {
        int[][] expected = {
                {15, 13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7, 10, 11}
        };

        int[][] matrix = {
                {5, 1, 9, 1},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };

        int[][] actual = RotateMatrix.rotate(matrix);

        assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    public void test3() {
        int[][] expected = {
                {1}
        };

        int[][] matrix = {
                {1}
        };

        int[][] actual = RotateMatrix.rotate(matrix);

        assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    public void test4() {
        int[][] expected = {
                {3, 1},
                {4, 2}
        };

        int[][] matrix = {
                {1, 2},
                {3, 4}
        };



        int[][] actual = RotateMatrix.rotate(matrix);

        assertTrue(Arrays.deepEquals(expected, actual));
    }

}