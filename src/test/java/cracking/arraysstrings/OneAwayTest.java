package cracking.arraysstrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class OneAwayTest {

    @Test
    public void test1() {
        assertTrue(OneAway.isOneAway("pale", "ple"));
    }

    @Test
    public void test2() {
        assertTrue(OneAway.isOneAway("pales", "pale"));
    }

    @Test
    public void test3() {
        assertTrue(OneAway.isOneAway("pale", "bale"));
    }

    @Test
    public void test4() {
        assertFalse(OneAway.isOneAway("pale", "bake"));
    }
}