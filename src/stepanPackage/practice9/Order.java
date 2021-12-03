package stepanPackage.practice9;

import java.util.ArrayList;

public class Order {
    private Client customer;
    private int totalPrice;
    private ArrayList<String> shoppingCart = new ArrayList<>();
    private static int idGlobal = 0;
    public static ArrayList<Order> orders = new ArrayList<>();
    private int id;

    public Order(Client customer) {
        this.id = idGlobal++;
        this.customer = customer;
        orders.add(this);
    }

    public int getId() {
        return id;
    }

    public Client getCustomer() {
        return customer;
    }

    public void executeOrder() {
        customer.addOrderCount();
        System.out.printf("Заказ номер %d был успешно создан", this.id);
    }
}
