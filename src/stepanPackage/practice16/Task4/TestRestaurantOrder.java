package stepanPackage.practice16.Task4;

import stepanPackage.practice16.task1.Drink;
import stepanPackage.practice16.task2.Dish;
import stepanPackage.practice16.task3.TablesOrderManager;

import java.util.Arrays;

public class TestRestaurantOrder {
    public static void main(String[] args) {
        TablesOrderManager orderManager = new TablesOrderManager();

        Drink drink = new Drink(155, "Dr. Pepper", "Un refresco muuuuuuy increible");
        Dish dish = new Dish(250, "Gaspacho", "Una sopa fria con tomatos");

        RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.add(drink);
        restaurantOrder.add(dish);

        orderManager.add(2, restaurantOrder);
        System.out.println("Las mesas libras - " + Arrays.toString(orderManager.freeTableNumbers()));
    }
}
