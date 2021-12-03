package stepanPackage.practice9;

public class OnlineMarketUI {
    public OnlineMarketUI() {
        showTitle("Welcome to Haze Market OS! Marinochka");
        System.out.println("");

        while (true) {
            executeMenu();
        }
    }

    private void showTitle(String word) {
        int letterCount = word.length();
        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 4) {
                for (int j = 0; j < 100; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            } else if(i == 2) {
                System.out.print("*");

                if (letterCount % 2 == 0) {
                    for (int k = 1; k < 50-(letterCount/2); k++) {
                        System.out.print(" ");
                    }
                    System.out.print(word);
                    for (int m = 1; m < 50-(letterCount/2); m++) {
                        System.out.print(" ");
                    }
                } else {
                    for (int b = 1; b < 50-(letterCount/2); b++) {
                        System.out.print(" ");
                    }
                    System.out.print(word);
                    for (int b = 1; b < 50-(letterCount/2+1); b++) {
                        System.out.print(" ");
                    }
                }

                System.out.println("*");
            } else {
                System.out.print("*");

                for (int k = 1; k < 99; k++) {
                    System.out.print(" ");
                }

                System.out.println("*");
            }
        }
    }

    private void executeMenu() {
        System.out.println("1. Добавить заказ");
        System.out.println("2. Список заказов");
        System.out.println("3. Список клиентов");

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
            default:
                System.out.println("Не могу распознать вариант выбора.");
        }
    }

    private void addOrder() {
        showTitle("Добавление заказа");
        System.out.println("Введите ИНН (11 цифр).");
        String ITN = TestMarket.scan.nextLine();
        try  {
            if (ITN.length() < 11) throw new ITNNotFoundException("Значение ИНН меньше 11 цифр");
            if (ITN.length() > 11) throw new ITNNotFoundException("Значение ИНН больше 11 цифр");
        } catch (ITNNotFoundException e) {
            System.out.println(e.toString());
            return;
        }

        Client toClient = null;
        try {
            toClient = Client.findClientByITN(ITN);
        } catch (ClientNotFoundException e) {
            if (!(e.equals(null))) {
                System.out.println("Введите имя и фамилию через пробел.");
                String names = TestMarket.scan.nextLine();
                String[] words = names.split(" ");
                toClient = new Client(ITN, words[0], words[1]);
            }
        }
        Order newOrder = new Order(toClient);

        newOrder.executeOrder();
        System.out.println("Заказ был успешно создан.");
    }

    private void showOrders() {
        showTitle("Список заказов");
        System.out.println("id      ITN             customer name");
        for (Order aOrder : Order.orders) {
            System.out.print(aOrder.getId());

            if (aOrder.getId() != 0) {
                for(int i = 0; i < (4 - getCountsOfDigits(aOrder.getId())); i++) {
                    System.out.print(" ");
                }
            } else {
                System.out.print("   ");
            }

            System.out.print("    ");
            System.out.printf("%s     %s %s\n", aOrder.getCustomer().getITN(), aOrder.getCustomer().getName(), aOrder.getCustomer().getSurname());
        }
    }

    private void showClients() {
        showTitle("Список клиентов");
        System.out.println("id      ИНН             Кол-во заказов    Имя и фамилия ");
        for (Client aClient : Client.clients) {
            System.out.print(aClient.getId());

            if (aClient.getId() != 0) {
                for(int i = 0; i < (4 - getCountsOfDigits(aClient.getId())); i++) {
                    System.out.print(" ");
                }
            } else {
                System.out.print("   ");
            }

            System.out.print("    ");
            System.out.printf("%s     %s", aClient.getITN(), aClient.getOrdersCount());
            if (aClient.getOrdersCount() != 0) {
                for(int i = 0; i < (17 - getCountsOfDigits(aClient.getOrdersCount())); i++) {
                    System.out.print(" ");
                }
            } else {
                System.out.print("                 ");
            }
            System.out.printf("%s %s\n", aClient.getName(), aClient.getSurname());
        }
    }

    public static int getCountsOfDigits(long number) {
        return(number == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(number) + 0.5));
    }
}
