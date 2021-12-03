package stepanPackage.practice8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;

    public WaitList();
    public WaitList(Collection<E> c);

    public String toString() {
        return "в";
    }
}
