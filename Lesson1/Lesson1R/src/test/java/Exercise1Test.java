import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {

    Exercise1 e;
    List<String> words;
    String finalWord;

    @Before
    public void setUp() throws Exception {
        e = new Exercise1();
        words = new ArrayList<>();
        words.add("Word1");
        words.add("another word");
        words.add("third word");
        finalWord = "Wat";
    }

    @Test
    public void testFirstLetterOfEachWordClassic() throws Exception {
        String returnedWord = e.firstLetterOfEachWordClassic(words);
        assertEquals("words are not equal",finalWord,returnedWord);
    }

    @Test
    public void testFirstLetterOfEachWordLambda() throws Exception {
        String returnedWord = e.firstLetterOfEachWordLambda(words);
        assertEquals("words are not equal",finalWord,returnedWord);
    }
}