import java.util.*;
import java.util.function.Consumer;
/**
 * OrdenaStrings
 */
public class OrdenaStrings {
    public static void main(String[] args) throws Exception{
        List<String> palavras = new ArrayList<>();
        palavras.add("Nothing but thieves");
        palavras.add("Twenty one pilots");
        palavras.add("Cage the elephant");
        
        Collections.sort(palavras);
        Consumer consumidor = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        palavras.forEach(consumidor);
    }
}