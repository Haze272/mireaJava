package stepanPackage.practice16.task1;

import stepanPackage.practice16.task2.Item;

public class TestDrink {

    public static void main(String[] args) {
        Drink drink1 = new Drink(45, "Sprunk", "A nice drink for teens");
        Drink drink2 = new Drink(55, "Fanta", "Fanta is the drink of Santa");

        System.out.println(drink1.toString());
    }
}
