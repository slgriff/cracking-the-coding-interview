package cracking.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheMasseuseTest {

    @Test
    public void test() {
        int expected = 180;

        int[] requests = {30, 15, 60, 75, 45, 15, 15, 45};

        int actual = TheMasseuse.solve(requests);

        assertEquals(expected, actual);
    }

}