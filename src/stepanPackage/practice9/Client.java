package stepanPackage.practice9;

import stepanPackage.practice6.Student;

import java.util.ArrayList;

public class Client {
    private int ITN;
    private String name, surname;
    public static ArrayList<Client> clients = new ArrayList<>();

    public Client(int ITN, String name, String surname) {
        this.ITN = ITN;
        this.name = name;
        this.surname = surname;

        clients.add(this);
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
