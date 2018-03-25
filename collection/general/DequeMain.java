import java.util.*;

/**
 * DequeMain
 */
public class DequeMain {
    public static void main(String[] args) {
        Deque<String> deck = new LinkedList<>();
        deck.add("1");
        deck.add("2");
        deck.add("3");
        deck.add("4");
        deck.addFirst("0");
        deck.addLast("-1");
        //Expressão Lambda
        deck.forEach(d -> System.out.println(d));
        deck.removeLast();
    }
}