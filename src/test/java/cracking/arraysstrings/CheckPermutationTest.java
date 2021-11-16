package cracking.arraysstrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPermutationTest {

    @Test
    public void test1() {
        assertFalse(CheckPermutation.isPermutation("test", "ttew"));
    }

    @Test
    public void test2() {
        assertTrue(CheckPermutation.isPermutation("geeksforgeeks", "forgeeksgeeks"));
    }

}