package cracking.arraysstrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class URLifyTest {

    @Test
    public void test() {
        char[] expected = {'M', 'r', '%', '2', '0', 'J', 'o', 'h' , 'n', '%', '2', '0', 'S', 'm', 'i', 't', 'h'};
        char[] arr = {'M', 'r', ' ', 'J', 'o', 'h' , 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' '};
        URLify.urlify(arr, 13);
        assertArrayEquals(expected, arr);
    }

}