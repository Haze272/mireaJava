package stepanPackage.practice9;

public class OnlineMarketUI {
    public OnlineMarketUI() {
        showTitle("Welcome to Haze Market OS!");
        System.out.println("");

        executeMenu();
    }

    public void showTitle(String word) {
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

    public void executeMenu() {
        System.out.println("1. Add order");
        System.out.println("2. Show orders");
        System.out.println("3. Show clients");
    }
}
