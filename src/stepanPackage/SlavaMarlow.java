package stepanPackage;

public class SlavaMarlow {
    public static void showTitle(String word) {
        int letterCount = word.length();
        System.out.println("");
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
}
