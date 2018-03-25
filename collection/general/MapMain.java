import java.util.HashMap;
import java.util.Map;

/**
 * MapMain
 */

public class MapMain {

    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        for(String str : args) {
            Integer freq = m.get(str);
            m.put(str, (freq == null) ? 1 : freq + 1);
        }
        System.out.println(m.size() + " distinct words: ");
        System.out.println(m);
    }
    
}