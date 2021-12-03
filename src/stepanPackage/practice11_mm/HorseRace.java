package stepanPackage.practice11_mm;

import java.util.ArrayList;
import java.util.Scanner;

public class HorseRace {

    public HorseRace(int n) {
        Scanner sc = new Scanner(System.in);
        String intpu;
        Horse curHorse;

        for (int i = 1; i <= n; i++) {
            System.out.printf("Введите имя лошади %d\n", i);
            intpu = TestSynch.scan.next();
            curHorse = new Horse(intpu);
        }
    }

    public void startRace() {
        for (int i = 0; i < Horse.horses.size(); i++) {
            Horse.horses.get(i).setPosition(0);
        }

        boolean isFinished = false;
        do {

            for (int m = 0; m < Horse.horses.size(); m++) {
                Horse.horses.get(m).run();
                if (m != 0) {
                    if (Horse.horses.get(m).getPosition() > Horse.horses.get(m-1).getPosition()) {
                        Horse.swap(m, m-1);
                    }
                }
            }

            for (int j = 0; j < Horse.horses.size(); j++) {
                if (Horse.horses.get(j).getPosition() >= 1000) {
                    isFinished = true;
                }
            }
        } while (isFinished);

        System.out.println("\n\n-------------------------------------------------------\n");

        for (int q = 0; q < Horse.horses.size(); q++) {
            System.out.printf("%d место: %s\n", q+1,Horse.horses.get(q).getName());
        }
    }
}
