package Multithreading;

import java.util.LinkedList;
import java.util.Queue;

class PC {
    Queue<Integer> queue = new LinkedList<>();
    int capacity = 5;

    public synchronized void  produce() throws  InterruptedException {
        int value = 0;
        while (true) {
            while (queue.size()==capacity)
                wait();

            queue.add(value);
            System.out.println();
        }
    }
}
public class ProducerConsumer {
}
