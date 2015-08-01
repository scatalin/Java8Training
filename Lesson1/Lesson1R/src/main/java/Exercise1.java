import java.util.List;

/**
 * Created by Catalin on 7/31/2015 .
 */
public class Exercise1 {

    public String firstLetterOfEachWordClassic(List<String> words){
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            sb.append(word.charAt(0));
        }
        return sb.toString();
    }

    public String firstLetterOfEachWordLambda(List<String> words){
        StringBuilder sb = new StringBuilder();
        words.forEach(s -> sb.append(s.charAt(0)));
        return sb.toString();
    }
}
