package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Customer1");
        queue.add("Customer2");
        queue.add("Customer3");

        while ( !queue.isEmpty()) {
            System.out.println("Serving: " + queue.poll());
        }
    }
}
