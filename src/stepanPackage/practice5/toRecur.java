package stepanPackage.practice5;

public class toRecur {
    public int digitsCount(int n) {
        //return ( n == 0 ) ? 1 : (int)Math.log10(n) + 1;
        if(n / 10 >= 1) {
            int tempvar = n % 10;
            int remain = n / 10;
            return tempvar + digitsCount(remain);
        } else {
            return n;
        }
    }

    public String isPrime(int n, int i)
    {
        if (n == 2) return "YES"; // особый случай

        if (n % i == 0) return "NO";

        if(i <= Math.sqrt(n)) // проверяем не все делители а только до корня квадратного из числа
            return isPrime(n, i + 1);
        else return "YES";
    }

    public static void factorize(int n, int k) {
        if (k > n) return;
        if (n % k == 0)
        {
            System.out.println(k);
            while(n % k == 0)
            {
                n = n / k;
            }
        }
        factorize(n,k + 1);
    }
}
