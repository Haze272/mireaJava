package stepanPackage.practice11.task1;

import stepanPackage.SlavaMarlow;

import java.util.LinkedList;

public class TestQueue {
    public static void main(String[] args) {
        SlavaMarlow.showTitle("Тест singleton-очереди");
        ArrayQueueModule queueModule = ArrayQueueModule.getInstance();

        Ant ant1 = new Ant();
        Ant ant2 = new Ant();
        Ant ant3 = new Ant();
        queueModule.enqueue(ant1);
        queueModule.enqueue(ant2);
        queueModule.enqueue(ant3);
        System.out.println(queueModule.toString());


        System.out.printf("First element of queue is %s\n", queueModule.element().toString());

        System.out.printf("Removing %s...\n", queueModule.dequeue().toString());
        System.out.printf("Queue now:\n%s", queueModule.toString());

        System.out.printf("The size of queue is %d\n", queueModule.size());

        queueModule.clear();
        System.out.println("The queue has been cleared, queue now:");
        System.out.print(queueModule.toString());

        SlavaMarlow.showTitle("Тест абстрактной очереди");
        LinkedList<String> dict = new LinkedList<>();
        ArrayQueueADT abstractQueue = new ArrayQueueADT<>(dict);

        String raper1 = new String("Eminem");
        String raper2 = new String("Busta Rhymes");
        String raper3 = new String("2pac");

        abstractQueue.enqueue(raper1);
        abstractQueue.enqueue(raper2);
        abstractQueue.enqueue(raper3);
        System.out.println(abstractQueue.toString());

        System.out.printf("First element of abstract queue is %s\n", abstractQueue.element());

        System.out.printf("Removing %s...\n", abstractQueue.dequeue());
        System.out.printf("Queue now:\n%s", abstractQueue.toString());

        System.out.printf("The size of queue is %d\n", abstractQueue.size());

        abstractQueue.clear();
        System.out.println("The queue has been cleared, queue now:");
        System.out.print(abstractQueue.toString());

    }
}
