package stepanPackage;
import java.lang.*;

public class Stepan {
    public static void main(String[] args) {
        Ball ElFortuno = new Ball("yellow", "oval");
        Ball Bastketball = new Ball("orange");
        Ball Simple = new Ball();

        System.out.println(ElFortuno.ToString());
        System.out.println(Bastketball.ToString());
        System.out.println(Simple.ToString());
    }
}
