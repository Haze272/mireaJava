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

    public void isPrime(int n, int i)
    {
        if (n == 2) System.out.println("YES"); // особый случай

        else if (n % i == 0) System.out.println("NO");

        else if(i <= Math.sqrt(n)) // проверяем не все делители а только до корня квадратного из числа
            isPrime(n, i + 1);
        else System.out.println("YES");
    }

    private boolean isPalindrome(String s) {

        if (s.length() <= 1) {
            return true;
        }

        char l = s.charAt(0);
        char r = s.charAt(s.length() - 1);

        if (l == r) {
            String sub = s.substring(1, s.length() - 1);
            return isPalindrome(sub);
        }

        return false;
    }

    public void checkPalindrome(String str) {
        if (isPalindrome(str) == true) System.out.println("YES");
        else System.out.println("NO");
    }

    public int reverseNum(int num) {
//ss
    }
}
