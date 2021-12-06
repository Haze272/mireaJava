package stepanPackage.practice10.task2;

import java.util.Scanner;

public class TestChair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ChairFactory aFactory = new ChairFactory();

        FunctionalChair chair1 = aFactory.createFunctionalChair();
        System.out.println(chair1.sum(4, 6));

        VictorianChair chair2 = aFactory.createVictorianChair(155);
        System.out.printf("This chair has %d years old!\n", chair2.getAge());

        MagicChair chair3 = aFactory.createMagicChair();
        chair3.doMagic();
    }
}
