import java.util.stream;
import java.util.*;


/**
 * CollectionMain
 */
public class CollectionMain {

    public static void main(String [] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Alexandre");
        nomes.add("Julia");
        nomes.add("Enzo");
        nomes.remove(0);
        if(nomes.isEmpty()) {
            nomes.add("Pedro");
        } else {
            nomes.add("José");
        }
        //Aggregate Operations
        //nomes.stream().filter(f -> !f.equalsIgnoreCase("João")).forEach(f -> System.out.println(f));

        //Likewise, you could easily request a parallel stream, which might make sense if the collection is large enough and your computer has enough cores:
        nomes.parallelStream().filter(f -> !f.equalsIgnoreCase("João")).forEach(f -> System.out.println(f));

        String unidos = nomes.stream().map(Object::toString).collect(Collectors.joining(", "));
        System.out.println("********************");
        System.out.println(unidos);
    }
    
}