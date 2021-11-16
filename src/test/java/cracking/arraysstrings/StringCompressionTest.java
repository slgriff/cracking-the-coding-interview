package cracking.arraysstrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressionTest {

    @Test
    public void test1() {
        assertEquals("a2b1c5a3", StringCompression.compress("aabcccccaaa"));
    }

    @Test
    public void test2() {
        assertEquals("a3b2c4d1", StringCompression.compress("aaabbccccd"));
    }

    @Test
    public void test3() {
        assertEquals("x3y2z1i4", StringCompression.compress("xxxyyziiii"));
    }

    @Test
    public void test4() {
        assertEquals("k6i6u4a1s1d1f1l4", StringCompression.compress("kkkkkkiiiiiiuuuuasdfgllll"));
    }

    @Test
    public void test5() {
        assertEquals("w4a3d1e1x6", StringCompression.compress("wwwwaaadexxxxxx"));
    }

    @Test
    public void test6() {
        assertEquals("geeksforgeeks", StringCompression.compress("geeksforgeeks"));
    }

}