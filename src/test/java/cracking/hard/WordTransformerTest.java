package cracking.hard;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class WordTransformerTest {


    @Test
    public void test() {
        List<String> expected = List.of("DAMP", "LAMP", "LIMP", "LIME", "LIKE");

        List<String> actual = WordTransformer.getTransformation("DAMP", "LIKE");

        assertEquals(expected, actual);
    }
}