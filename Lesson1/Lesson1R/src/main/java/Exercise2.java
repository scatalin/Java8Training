import java.util.Iterator;
import java.util.List;

/**
 * Created by Catalin on 7/31/2015 .
 */
public class Exercise2 {

    public void removeOddLengthWordsFor(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            if ((words.get(i).length() & 1) == 1) {
                words.remove(i);
                i--;
            }
        }
    }

    public void removeOddLengthWordsIterator(List<String> words) {
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() % 2 == 1) {
                iterator.remove();
            }
        }
    }


    public void removeOddLengthWordsLambda(List<String> words) {
        words.removeIf(s -> (s.length()) % 2 == 1);
    }
}
