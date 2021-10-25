package stepanPackage.practice5;

public class toRecurTest {
    public static void main(String[] args) {
        toRecur rec = new toRecur();

        System.out.println(rec.digitsCount(272));

        System.out.println(rec.isPrime(32, 2));

        rec.factorize(32, 2);
    }
}
