package stepanPackage.practice5;

public class toRecur {
    public int sumDigit(int num) {
        if (num == 0) {
            return num;
        }
        this->sumDigit(num/10);
    }
}
