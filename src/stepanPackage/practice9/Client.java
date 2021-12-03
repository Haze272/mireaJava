package stepanPackage.practice9;

import stepanPackage.practice6.Student;

import java.util.ArrayList;

public class Client {
    private String ITN, name, surname;
    public static ArrayList<Client> clients = new ArrayList<>();
    private static int idGlobal = 0;
    private int id;
    private int ordersCount = 0;

    public Client(String ITN, String name, String surname) {
        this.id = idGlobal++;
        this.ITN = ITN;
        this.name = name;
        this.surname = surname;

        clients.add(this);
    }

    public static Client findClientByITN(String ITNy) throws ClientNotFoundException {
        // TODO сделать адекватный поиск с нормальным 0-временем
        Client result = null;
        for(Client aClient : clients) {
            if (aClient.getITN().equals(ITNy)) {
                result = aClient;
            }
        }

        if(result == null) {
            throw new ClientNotFoundException("Клиент не найден в базе");
        }
        return result;
    }

    public String getITN() {
        return ITN;
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
                "ITN=" + ITN +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
