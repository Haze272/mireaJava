package stepanPackage.practice16.task3;

import stepanPackage.practice16.task1.Drink;
import stepanPackage.practice16.task2.Dish;

public class TestOrder {
    public static void main(String[] args) {
        TablesOrderManager orderManager = new TablesOrderManager();

        Drink drink1 = new Drink(45, "Sprunk", "A nice drink for teens");
        Drink drink2 = new Drink(55, "Fanta", "Fanta is the drink of Santa");
        Dish dish1 = new Dish(25,"La Paella", "Plato cuyo ingrediente principal es el arroz");

        InternetOrder internetOrder = new InternetOrder();
        internetOrder.add(drink1);
        internetOrder.add(drink2);
        internetOrder.add(dish1);

        System.out.println(internetOrder.costTotal() + " es total");

        orderManager.add("C. de Mallorca, 401, 08013 Barcelona", internetOrder);

        System.out.println("Numero de pedidos online - Paella: " + orderManager.itemInternetQuantity("La Paella"));
        System.out.println("La suma - (euro) " + orderManager.internetCostSummary());

    }
}
