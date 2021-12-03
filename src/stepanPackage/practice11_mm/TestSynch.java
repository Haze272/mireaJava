package stepanPackage.practice11_mm;

import java.util.Scanner;

public class TestSynch {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите количество лошадей");
        int horsesQuantity = scan.nextInt();

        HorseRace game = new HorseRace(horsesQuantity);

        game.startRace();
    }
}
