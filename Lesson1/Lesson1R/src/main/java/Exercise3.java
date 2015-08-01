import java.util.Iterator;
import java.util.List;

/**
 * Created by Catalin on 7/31/2015 .
 */
public class Exercise3 {

    public void replaceWordsWithUpperCaseFor(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            words.set(i, words.get(i).toUpperCase());
        }
    }

    public void replaceWordsWithUpperCaseIterator(List<String> words) {
        Iterator<String> iterator = words.iterator();
        iterator.forEachRemaining(s -> s = s.toUpperCase());
    }

    public void replaceWordsWithUpperCaseLambda(List<String> words) {
        words.replaceAll(String::toUpperCase);
    }
}
