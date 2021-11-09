package stepanPackage.practice5;

public class toRecurTest {
    public static void main(String[] args) {
        toRecur rec = new toRecur();

        System.out.println(rec.digitsCount(272));

        rec.isPrime(32, 2);

        rec.checkPalindrome("itgood");
        rec.checkPalindrome("momom");
    }
}
