package cracking.collections.queues;

import java.util.LinkedList;

public class Queue<T> {
    LinkedList<T> queue;

    public Queue() {
        queue = new LinkedList<T>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void enqueue(T item) {
        queue.addLast(item);
    }

    public T dequeue() {
        return queue.removeFirst();
    }

    public T peek() {
        return queue.getFirst();
    }
}
