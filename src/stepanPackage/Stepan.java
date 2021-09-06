package stepanPackage;
import java.lang.*;

public class Stepan {
    public static void main(String[] args) {
        Ball ElFortuno = new Ball("yellow", "oval");
        Ball Bastketball = new Ball("orange");
        Ball Simple = new Ball();

        Libre book1 = new Libre(321, "Byte of Python", "C H Swaroop");
        Libre book2 = new Libre(9999, "Meaning of life");
        Libre book3 = new Libre(5);

        System.out.println(ElFortuno.ToString());
        System.out.println(Bastketball.ToString());
        System.out.println(Simple.ToString());

        System.out.println(book1.ToString());
        System.out.println(book2.ToString());
        System.out.println(book3.ToString());
    }
}
