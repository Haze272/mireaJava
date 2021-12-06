package stepanPackage.practice10.task1;

import java.util.Scanner;

public class TestComplex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int real;
        int image;

        ConcreteFacrtory aFactory = new ConcreteFacrtory();

        Complex aComplex = aFactory.createComplex();
        System.out.println(aComplex.toString());


        System.out.println("\nPrint the real and image: ");
        real = in.nextInt();
        image = in.nextInt();

        Complex anotherComplex = aFactory.createComplex(real, image);
        System.out.println(anotherComplex.toString());
    }
}
