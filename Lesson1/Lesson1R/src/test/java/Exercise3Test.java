import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Exercise3Test {

    Exercise3 e;
    List<String> initialWords;
    List<String> finalWords;

    @Before
    public void setUp() throws Exception {
        e = new Exercise3();
        initialWords = new ArrayList<>();
        initialWords.add("Word");
        initialWords.add("another1");
        initialWords.add("third");
        finalWords = new ArrayList<>();
        finalWords.add("WORD");
        finalWords.add("ANOTHER1");
        finalWords.add("THIRD");

    }

    @Test
    public void testReplaceWordsWithUpperCaseFor() throws Exception {
        e.replaceWordsWithUpperCaseFor(initialWords);
        assertEquals("listele nu sunt egale", finalWords, initialWords);
    }

    @Ignore
    @Test
    public void testReplaceWordsWithUpperCaseIterator() throws Exception {
        e.replaceWordsWithUpperCaseIterator(initialWords);
        assertEquals("listele nu sunt egale", finalWords, initialWords);
    }

    @Test
    public void testReplaceWordsWithUpperCaseLambda() throws Exception {
        e.replaceWordsWithUpperCaseLambda(initialWords);
        assertEquals("listele nu sunt egale", finalWords, initialWords);
    }
}