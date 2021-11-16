package cracking.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class VolumeOfHistogramTest {

    @Test
    public void test() {
        int expected = 26;

        int[] data = {0, 0, 4, 0, 0, 6, 0, 0, 3, 0, 5, 0, 1, 0, 0, 0};

        int actual = VolumeOfHistogram.volumeOfHistogram(data);

        assertEquals(expected, actual);
    }

}