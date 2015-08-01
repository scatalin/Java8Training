import java.util.Map;

/**
 * Created by Catalin on 8/1/2015 .
 */
public class Exercise4 {

    public String convertMapInStringClassic(Map<String, Integer> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey()).append(entry.getValue());
        }
        return sb.toString();
    }

    public String convertMapInStringLambda(Map<String, Integer> map) {
        StringBuilder sb = new StringBuilder();
        map.forEach((k, v) -> sb.append(k).append(v));
        return sb.toString();
    }

}
