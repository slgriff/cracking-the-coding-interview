package cracking.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestWordTest {

    @Test
    public void test() {

        String expected = "dogwalker";

        String[] words = {"cat", "banana", "dog", "nana", "walk", "walker", "dogwalker"};

        String actual = LongestWord.getLongestWord(words);

        assertEquals(actual, expected);
    }

}