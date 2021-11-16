package cracking.arraysstrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringRotationTest {

    @Test
    public void test1() {
        assertTrue(StringRotation.isRotation("waterbottle", "erbottlewat"));
    }

    @Test
    public void test2() {
        assertTrue(StringRotation.isRotation("ABCD", "CDAB"));
    }

    @Test
    public void test3() {
        assertTrue(StringRotation.isRotation("ABAD", "ADAB"));
    }

    @Test
    public void test4() {
        assertFalse(StringRotation.isRotation("ABCD", "ACBD"));
    }

}