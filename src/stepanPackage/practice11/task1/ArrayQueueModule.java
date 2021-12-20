package stepanPackage.practice11.task1;
import java.util.LinkedList;

public class ArrayQueueModule implements IQueue<Ant> {
    private static ArrayQueueModule instance;
    private LinkedList<Ant> antQueue;
    private ArrayQueueModule() {
        antQueue = new LinkedList<>();
    }
    public static ArrayQueueModule getInstance() {
        if (ArrayQueueModule.instance == null) {
            ArrayQueueModule.instance = new ArrayQueueModule();
        }
        return ArrayQueueModule.instance;
    }
    @Override public void enqueue(Ant anAnt) {
        antQueue.add(anAnt);
    }
    @Override public Ant element() {
        return antQueue.element();
    }
    @Override public Ant dequeue() {
        return antQueue.removeFirst();
    }
    @Override public int size() {
        return antQueue.size();
    }
    @Override public boolean isEmpty() {
        return antQueue.isEmpty();
    }
    @Override public void clear() {
        antQueue.clear();
    }
    @Override
    public String toString() {
        String result = "";
        if (antQueue.isEmpty()) result = "The queue is absolutely empty!";
        for (Ant anty : antQueue) {
            result += "Ant" + String.valueOf(anty.getId()) + "\n";
        }
        return result;
    }
}
