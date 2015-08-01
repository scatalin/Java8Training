import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;


public class Exercise4Test {

    Exercise4 e;
    Map<String, Integer> map;
    String expectedResult;

    @Before
    public void setUp() {
        e = new Exercise4();
        map = new TreeMap<>();
        map.put("c", 3);
        map.put("b", 2);
        map.put("a", 1);
        expectedResult = "a1b2c3";
    }

    @Test
    public void testConvertMapInStringClassic() throws Exception {
        String result = e.convertMapInStringClassic(map);
        assertEquals("map not complete", expectedResult, result);
    }

    @Test
    public void testConvertMapInStringLambda() throws Exception {
        String result = e.convertMapInStringLambda(map);
        assertEquals("map not complete", expectedResult, result);
    }
}