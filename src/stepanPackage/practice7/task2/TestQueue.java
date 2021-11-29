package stepanPackage.practice7.task2;

import stepanPackage.practice7.Card;
import java.util.*;

public class TestQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Card> deck1 = new ArrayDeque();
        ArrayDeque<Card> deck2 = new ArrayDeque();

        System.out.println("Введите значения карт первого игрока");
        String str = sc.nextLine();
        String[] cards = str.split(" ");

        for (String aCard : cards) {
            Card newCard = new Card(Integer.parseInt(aCard));
            deck1.addLast(newCard);
        }

        System.out.println("Введите значения карт первого игрока");

        str = sc.nextLine();
        cards = str.split(" ");

        for (String aCard : cards) {
            Card newCard = new Card(Integer.parseInt(aCard));
            deck2.addLast(newCard);
        }

        boolean isEnd = false;
        int turnCount = 0;
        do {
            turnCount++;

            if (deck1.peekFirst().compareTo(deck2.peekFirst()) > 0) {
                deck1.addLast(deck2.removeFirst());
            } else if (deck1.peekFirst().compareTo(deck2.peekFirst()) < 0){
                deck2.addLast(deck1.removeFirst());
            } else {
                deck1.removeFirst();
                deck2.removeFirst();
            }

            ArrayDeque<Card> clone = deck1.clone();
            while (clone.isEmpty() == false) {
                System.out.print(clone.removeFirst().getValue() + " ");
            }
            System.out.print("       vs       ");
            clone = deck2.clone();
            while (clone.isEmpty() == false) {
                System.out.print(clone.removeFirst().getValue() + " ");
            }
            System.out.println(" ");

            if (deck1.size() == 0) {
                isEnd = true;
                System.out.print("Second " + turnCount);
            } else if (deck2.size() == 0) {
                isEnd = true;
                System.out.print("First " + turnCount);
            } else if (turnCount == 106) {
                System.out.println("Botva!");
            }
        } while (isEnd == false);
    }
}
