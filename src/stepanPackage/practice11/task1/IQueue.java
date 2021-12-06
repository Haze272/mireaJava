package stepanPackage.practice11.task1;

public interface IQueue<E> {
    void enqueue(E element);
    E element();
    E dequeue();
    int size();
    boolean isEmpty();
    void clear();
}
