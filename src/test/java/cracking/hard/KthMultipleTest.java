package cracking.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class KthMultipleTest {

    @Test
    public void test() {
        assertEquals(1, KthMultiple.getKthMultiple(1));
        assertEquals(3, KthMultiple.getKthMultiple(2));
        assertEquals(5, KthMultiple.getKthMultiple(3));
        assertEquals(7, KthMultiple.getKthMultiple(4));
        assertEquals(9, KthMultiple.getKthMultiple(5));
        assertEquals(15, KthMultiple.getKthMultiple(6));
        assertEquals(21, KthMultiple.getKthMultiple(7));
    }

}