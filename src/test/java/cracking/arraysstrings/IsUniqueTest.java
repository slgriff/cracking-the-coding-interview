package cracking.arraysstrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsUniqueTest {

    @Test
    public void test1() {
        assertTrue(IsUnique.isUnique("abcd10jk"));
    }

    @Test
    public void test2() {
        assertFalse(IsUnique.isUnique("hutg9mnd!nk9"));
    }
}