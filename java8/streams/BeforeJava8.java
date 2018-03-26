import java.util.*;

/**
 * BeforeJava8
 */
public class BeforeJava8 {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("Julinho da Van","Rogerinho do Ingá","Palestrinha","Renan da Van");
        List<String> result = getFilterOutput(lines, "Renan da Van");
        for(String temp : result) {
            System.out.println(temp);
        }

    }
    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!"Renan da Van".equals(line)) { // we dont like mkyong
                result.add(line);
            }
        }
        return result;
    }
}