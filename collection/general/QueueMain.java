import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

    public static void main(String[] args) throws InterruptedException{
        int time = Integer.parseInt(args[0]);
        Queue<Integer> queue = new LinkedList<>();
        for(int i = time; i >= 0; i--) {
            queue.add(i);
        }
        System.out.println("Método peek() pegará qual item da fila? "+queue.peek());
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
            Thread.sleep(1000);
        }
        if( queue.poll() == null ) {
            System.out.println("Retornou null ao invés da exception");
        }
        Thread.sleep(1000);
        try {
            queue.remove();
        } catch(Exception ie) {
            //Exception in thread "main" java.util.NoSuchElementException
            System.out.println("Retornou exception");
        }
    }
}