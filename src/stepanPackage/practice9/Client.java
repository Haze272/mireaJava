package stepanPackage.practice9;

import java.util.ArrayList;

public class Client {
    private String INN, name, surname;
    public static ArrayList<Client> clients = new ArrayList<>();
    private static int idGlobal = 0;
    private int id;
    private int ordersCount = 0;

    public Client(String INN, String name, String surname) {
        this.id = idGlobal++;
        this.INN = INN;
        this.name = name;
        this.surname = surname;

        clients.add(this);
    }

    public static Client findClientByINN(String INNy) throws ClientNotFoundException {
        // TODO сделать адекватный поиск с нормальным 0-временем
        Client result = null;
        for(Client aClient : clients) {
            if (aClient.getINN().equals(INNy)) {
                result = aClient;
            }
        }

        if(result == null) {
            throw new ClientNotFoundException("Клиент не найден в базе");
        }
        return result;
    }

    public String getINN() {
        return INN;
    }

    public int getId() {
        return id;
    }

    public int getOrdersCount() {
        return ordersCount;
    }

    public void addOrderCount() {
        this.ordersCount++;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Client{" +
                "INN=" + INN +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
