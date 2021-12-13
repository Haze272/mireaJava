package stepanPackage.practice12to15.task4;

public class PhoneNumber {
    private String formattedNumber;

    PhoneNumber(String number) {
        StringBuilder stringBuffer = new StringBuilder(number);

        String code = stringBuffer.substring(0, stringBuffer.length() - 10);
        if (code.equals("8"))
            code = "+7";

        String firstDigit = stringBuffer.substring(stringBuffer.length() - 10, stringBuffer.length() - 7);
        String secondDigit = stringBuffer.substring(stringBuffer.length() - 7, stringBuffer.length() - 4);
        String thirdDigit = stringBuffer.substring(stringBuffer.length() - 4, stringBuffer.length());

        this.formattedNumber = code + " (" + firstDigit + ") " + secondDigit + "-" + thirdDigit;
    }

    public String getFormattedNumber() {
        return this.formattedNumber;
    }

    public static void main(String[] args) {
        PhoneNumber phoneNumberFirst = new PhoneNumber("+79256709044");
        PhoneNumber phoneNumberSecond = new PhoneNumber("88005553535");
        System.out.println(phoneNumberFirst.getFormattedNumber());
        System.out.println(phoneNumberSecond.getFormattedNumber());
    }
}
