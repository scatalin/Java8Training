import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Exercise2Test {

    Exercise2 e;
    List<String> initialWords;
    List<String> finalWords;

    @Before
    public void setUp() throws Exception {
        e = new Exercise2();
        initialWords = new ArrayList<>();
        initialWords.add("baba");
        initialWords.add("Word1");
        initialWords.add("mama");
        initialWords.add("another");
        initialWords.add("tata");
        initialWords.add("third");
        initialWords.add("caca");

        finalWords = new ArrayList<>();
        finalWords.add("baba");
        finalWords.add("mama");
        finalWords.add("tata");
        finalWords.add("caca");
    }

    @Test
    public void testRemoveOddLengthWordsFor() throws Exception {
        e.removeOddLengthWordsFor(initialWords);
        assertEquals("listele nu sunt egale",finalWords,initialWords);
    }

    @Test
    public void testRemoveOddLengthWordsIterator() throws Exception {
        e.removeOddLengthWordsIterator(initialWords);
        assertEquals("listele nu sunt egale",finalWords,initialWords);
    }

    @Test
    public void testRemoveOddLengthWordsLambda() throws Exception {
        e.removeOddLengthWordsLambda(initialWords);
        assertEquals("listele nu sunt egale",finalWords,initialWords);
    }
}