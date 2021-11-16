package cracking.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountOf2sTest {

    @Test
    public void test() {
        int expected = 9;
        int actual = CountOf2s.getCount(25);
        assertEquals(expected, actual);
    }

}