import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TestJava8
 */
public class TestJava8 {
    public static void main(String[] args) {
        List<String> alpha = Arrays.asList("a","b","c","d");
        //Before Java8
        List<String> alphaUpper = new ArrayList<>();        
        for(String s : alpha) {
            alphaUpper.add(s.toUpperCase());
        }
        System.out.println(alpha);
        System.out.println(alphaUpper);

        //JAVA 8
        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        //alpha.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);



    }
}