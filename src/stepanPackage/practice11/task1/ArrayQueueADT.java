package stepanPackage.practice11.task1;
import java.util.LinkedList;

public class ArrayQueueADT<E> implements IQueue<E>{
    private LinkedList<E> abstractQueue;
    ArrayQueueADT(LinkedList<E> morgenstern) {
        abstractQueue = morgenstern;
    }
    @Override
    public void enqueue(E element) {
        abstractQueue.add(element);
    }
    @Override
    public E element() {
        return abstractQueue.element();
    }
    @Override
    public E dequeue() {
        return abstractQueue.removeFirst();
    }
    @Override
    public int size() {
        return abstractQueue.size();
    }
    @Override
    public boolean isEmpty() {
        return abstractQueue.isEmpty();
    }
    @Override
    public void clear() {
        abstractQueue.clear();
    }
    @Override
    public String toString() {
        String result = "";
        if (abstractQueue.isEmpty()) {
            result = "The queue is absolutely empty!";
        }

        for (E element : abstractQueue) {
            result += String.valueOf(element) + "\n";
        }
        return result;
    }
}
