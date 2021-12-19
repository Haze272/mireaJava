package stepanPackage.practice17;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
        System.out.println("---------------- Задание 1 ----------------");

        String testStr = "abcdefghijklmnopqrstuv340";

        System.out.println("Является строка в testStr строкой 'abcdefghijklmnopqrstuv18340': "
                + testStr.matches("abcdefghijklmnopqrstuv18340"));

        Pattern pattern = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        Matcher matcher = pattern.matcher(testStr);
        if (matcher.find()) {
            System.out.println("2 Является строка в testStr строкой 'abcdefghijklmnopqrstuv18340': да");
        } else {
            System.out.println("2 Является строка в testStr строкой 'abcdefghijklmnopqrstuv18340': нет");
        }

        System.out.println("---------------- Задание 2 ----------------");

        String testStr2 = "aE:dC:cA:56:76:54";

        Pattern pattern2 = Pattern.compile("^([a-zA-Z1-9]{2}[:]){5}([a-zA-Z1-9]{2})$");
        Matcher matcher2 = pattern2.matcher(testStr2);
        if (matcher2.find()) {
            System.out.println("Является ли МАК адресом: Да");
        } else
            System.out.println("Является ли МАК адресом: Нет");

        System.out.println("---------------- Задание 3 ----------------");

        List<String> list = Arrays.asList("25.65 USD", "5000 RUR", "34.72 BNB", "17.020 USD");
        Pattern pattern3 = Pattern.compile("^([0-9]+.[0-9]{2}) (USD|RUR|EU)$");

        StringBuilder all = new StringBuilder();
        for (String str : list) {
            if (pattern3.matcher(str).find()) {
                all.append(str).append(", ");
            }
        }
        System.out.println(all.substring(0, all.length()-2));
    }
}
