package stepanPackage.practice7.task1;

import stepanPackage.practice7.Card;
import java.util.*;

public class TestStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Card> deck1 = new Stack();
        Stack<Card> deck2 = new Stack();

        System.out.println("Введите значения карт первого игрока");
        String str = sc.nextLine();
        String[] cards = str.split(" ");

        for (String aCard : cards) {
            Card newCard = new Card(Integer.parseInt(aCard));
            deck1.push(newCard);
        }

        System.out.println("Введите значения карт первого игрока");

        str = sc.nextLine();
        cards = str.split(" ");

        for (String aCard : cards) {
            Card newCard = new Card(Integer.parseInt(aCard));
            deck2.push(newCard);
        }

        boolean isEnd = false;
        int turnCount = 0;
        do {
            turnCount++;

            if (deck1.peek().compareTo(deck2.peek()) > 0) {
                deck1.push(deck2.peek());
                deck2.pop();
            } else if (deck1.peek().compareTo(deck2.peek()) < 0){
                deck2.push(deck1.peek());
                deck1.pop();
            } else {
                deck1.pop();
                deck2.pop();
            }

            if (deck1.isEmpty() == true) {
                isEnd = true;
                System.out.print("Second " + turnCount);
            } else if (deck2.isEmpty() == true) {
                isEnd = true;
                System.out.print("First " + turnCount);
            } else if (turnCount == 106) {
                System.out.println("Botva!");
            }
        } while (isEnd == false);
    }
}
