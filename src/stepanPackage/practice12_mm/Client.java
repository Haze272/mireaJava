package stepanPackage.practice12_mm;

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

    public static ArrayList<Client> findClientsByName(String name, String surname) throws ClientNotFoundException {
        ArrayList<Client> resultClients = new ArrayList<>();
        for (Client toFind : clients) {
            if (toFind.name.equals(name) && toFind.surname.equals(surname)) {
                resultClients.add(toFind);
            }
        }

        if(resultClients.size() == 0) {
            throw new ClientNotFoundException("Клиент не найден в базе");
        }
        return resultClients;
    }

    public static ArrayList<Client> findClientsByName(String nameOrSurname) throws ClientNotFoundException {
        ArrayList<Client> resultClients = new ArrayList<>();
        for (Client toFind : clients) {
            if (toFind.name.equals(nameOrSurname) || toFind.surname.equals(nameOrSurname)) {
                resultClients.add(toFind);
            }
        }

        if(resultClients.size() == 0) {
            throw new ClientNotFoundException("Клиент не найден в базе");
        }
        return resultClients;
    }

    public static Client findClientByINN(String INNy) throws ClientNotFoundException {
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
