package stepanPackage.practice11.task2;


import java.util.Collection;

public interface Queue<E>{
    E element() throws NoSuchElementException;
    // Возвращает элемент из головы очереди. Элемент не удаляется.
    // Если очередь пуста, инициируется исключение NoSuchElementException.

    E remove() throws NoSuchElementException;
    // Удаляет элемент из головы очереди, возвращая его.
    // Инициирует исключение NoSuchElementException, если очередь пуста.

    E peek();
    // Возвращает элемент из головы очереди.
    // Возвращает null, если очередь пуста. Элемент не удаляется.

    E poll();
    // Возвращает элемент из головы очереди и удаляет его.
    // Возвращает null, если очередь пуста.

    boolean offer(E element);
    // Пытается добавить оbj в очередь.
    // Возвращает true, если оbj добавлен, и false в противном случае.
}
