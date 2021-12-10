package stepanPackage.practice12_mm;

import java.util.ArrayList;

public class OnlineMarketUI {
    public OnlineMarketUI() {
        System.out.println("");

        while (true) {
            showMenu();
        }
    }

    private void showMenu() {
        System.out.println("1. Добавить заказ");
        System.out.println("2. Список заказов");
        System.out.println("3. Список клиентов");
        System.out.println("4. Поиск клиента");

        String entering = TestMarket.scan.nextLine();

        switch (entering) {
            case "1":
                addOrder();
                break;
            case "2":
                showOrders();
                break;
            case "3":
                showClients();
                break;
            case "4":
                searchClient();
                break;
            default:
                System.out.println("Не могу распознать вариант выбора.");
        }
    }

    private void addOrder() {
        System.out.println("\t\tДобавление заказа\t\t");
        System.out.println("Введите ИНН (11 цифр).");
        String INN = TestMarket.scan.nextLine();
        try  {
            if (INN.length() < 11) throw new INNNotFoundException("Значение ИНН меньше 11 цифр");
            if (INN.length() > 11) throw new INNNotFoundException("Значение ИНН больше 11 цифр");
        } catch (INNNotFoundException e) {
            System.out.println(e.toString());
            return;
        }

        Client toClient = null;
        try {
            toClient = Client.findClientByINN(INN);
        } catch (ClientNotFoundException e) {
            if (!(e.equals(null))) {
                System.out.println("Введите имя и фамилию через пробел.");
                String names = TestMarket.scan.nextLine();
                String[] words = names.split(" ");
                toClient = new Client(INN, words[0], words[1]);
            }
        }
        Order newOrder = new Order(toClient);

        newOrder.executeOrder();
    }

    private void searchClient() {
        System.out.println("--------Поиск клиента по имени--------\n");
        System.out.print("Введете имя и фамилию через проблел (Иван Иванов) или что-то одно (Иван): ");

        String toName = TestMarket.scan.nextLine();
        String[] toNames = toName.split(" ");
        System.out.println(toNames[0] + " " + toNames[1]);
        try {
            ArrayList<Client> foundClients = Client.findClientsByName(toNames[0], toNames[1]);
            System.out.printf("Найдено %d клиентов\n", foundClients.size());

            System.out.println("id    ИНН              Кол-во заказов    Имя клиента");
            for (Client aClient : foundClients) {
                System.out.print(aClient.getId());

                for(int i = 0; i < (4 - getCountsOfDigits(aClient.getId())); i++) {
                    System.out.print(" ");
                }

                System.out.print("  ");
                System.out.printf("%s      %s", aClient.getINN(), aClient.getOrdersCount());
                if (aClient.getOrdersCount() != 0) {
                    for(int i = 0; i < (18 - getCountsOfDigits(aClient.getOrdersCount())); i++) {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("                 ");
                }
                System.out.printf("%s %s\n", aClient.getName(), aClient.getSurname());
            }

        } catch (ClientNotFoundException e) {
            System.out.println(e.toString());
            return;
        }
    }

    private void showOrders() {
        System.out.println("--------Список всех заказов--------");
        System.out.println("\n---------------------------------------------------");
        System.out.println("ID    ИНН             Имя клиента");
        for (Order aOrder : Order.orders) {
            System.out.print(aOrder.getId());

            for(int i = 0; i < (4 - getCountsOfDigits(aOrder.getId())); i++) {
                System.out.print(" ");
            }

            System.out.print("  ");
            System.out.printf("%s     %s %s\n", aOrder.getCustomer().getINN(), aOrder.getCustomer().getName(), aOrder.getCustomer().getSurname());
        }

        System.out.println("\n---------------------------------------------------");
    }

    private void showClients() {
        System.out.println("--------Список клиентов--------");
        System.out.println("\n---------------------------------------------------");
        System.out.println("id    ИНН              Кол-во заказов    Имя клиента");

        for (Client aClient : Client.clients) {
            System.out.print(aClient.getId());

            for(int i = 0; i < (4 - getCountsOfDigits(aClient.getId())); i++) {
                System.out.print(" ");
            }

            System.out.print("  ");
            System.out.printf("%s      %s", aClient.getINN(), aClient.getOrdersCount());
            if (aClient.getOrdersCount() != 0) {
                for(int i = 0; i < (18 - getCountsOfDigits(aClient.getOrdersCount())); i++) {
                    System.out.print(" ");
                }
            } else {
                System.out.print("                 ");
            }
            System.out.printf("%s %s\n", aClient.getName(), aClient.getSurname());
        }

        System.out.println("\n---------------------------------------------------");
    }

    public static int getCountsOfDigits(long number) {
        return(number == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(number) + 0.5));
    }
}
