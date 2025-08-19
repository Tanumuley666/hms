package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();
        tasks.offer("Email");
        tasks.offer("Meeting");

        System.out.println("Next Task: " + tasks.poll());
        System.out.println("Upcoming Task: " + tasks.peek());
    }
}
