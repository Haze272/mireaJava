package stepanPackage.practice11.task2;

import java.util.Iterator;

public class LinkedQueue<E> implements Queue<E>, Iterable<E> {
    private int n;         // number of elements on queue
    private Node first;    // beginning of queue
    private Node last;     // end of queue

    @Override
    public Iterator<E> iterator() {
        return new LinkedIterator();
    }

    private class LinkedIterator implements Iterator<E> {
        private Node current = first;

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public E next() {
            if (!hasNext()) throw new NoSuchElementException();
            E element = current.item;
            current = current.next;
            return element;
        }
    }

    private class Node {
        private E item;
        private Node next;
    }

    LinkedQueue() {
        first = null;
        last  = null;
        n = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void enqueue(E element) {
        Node oldlast = last;
        last = new Node();
        last.item = element;
        last.next = null;
        if (isEmpty()) first = last;
        else oldlast.next = last;
        n++;
    }

    @Override
    public E element() throws NoSuchElementException {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        return null;
    }

    @Override
    public E remove() throws NoSuchElementException {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        E element = first.item;
        first = first.next;
        n--;
        if (isEmpty()) last = null;
        return element;
    }

    @Override
    public E peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        return first.item;
    }

    @Override
    public E poll() {
        if (isEmpty()) return null;
        E element = first.item;
        first = first.next;
        n--;
        if (isEmpty()) last = null;
        return element;
    }

    @Override
    public boolean offer(E element) {
        enqueue(element);
        return true;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("--------------------------\n");
        for (E element : this)
            s.append(element + "\n");
        s.append("--------------------------\n");
        return s.toString();
    }
}
