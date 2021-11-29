package stepanPackage.practice7;

public class Card implements Comparable<Card> {

    private int value;

    public Card(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public int compareTo(Card anotherCard) {
        if (this.value == anotherCard.value) {
            return 0;
        } else if (this.value == 0 && anotherCard.value == 9) {
            return 1;
        } else if ((this.value == 9 && anotherCard.value == 0) || (this.value < anotherCard.value)) {
            return -1;
        } else {
            return 1;
        }
    }
}
