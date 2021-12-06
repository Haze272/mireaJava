package stepanPackage.practice11.task2;

import stepanPackage.SlavaMarlow;

public class TestCustomQueue {
    public static void main(String[] args) {
        SlavaMarlow.showTitle("LinkedQueue test");
        LinkedQueue<String> sickPeople = new LinkedQueue<>();
        sickPeople.enqueue("Morgenshtern");
        sickPeople.enqueue("Miron Yanovich");

        for (String sick : sickPeople) {
            System.out.printf("Patient %s\n", sick);
        }

        System.out.printf("Size of sick people queue is %d\n", sickPeople.size());
        System.out.printf("First patient who will be served by doctor is %s\n", sickPeople.peek());
        sickPeople.offer("Odyssey Nuzhin");
        System.out.println(sickPeople.toString());

    }
}
