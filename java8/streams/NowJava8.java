import java.util.*;
import java.util.stream.Collectors;

/**
 * NowJava8
 */
public class NowJava8 {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("Julinho da Van","Rogerinho do Ingá","Palestrinha","Renan da Van");
        List<String> result = lines
        .stream()
        .filter(l -> !"Renan da Van".equalsIgnoreCase(l))        
        .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}