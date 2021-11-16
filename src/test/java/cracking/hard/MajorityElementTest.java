package cracking.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class MajorityElementTest {

    @Test
    public void test() {
        int expected = 5;
        int[] nums = {1, 2, 5, 9, 5, 9, 5, 5, 5};
        int actual = MajorityElement.getMajorityElement(nums);
        assertEquals(expected, actual);
    }

}