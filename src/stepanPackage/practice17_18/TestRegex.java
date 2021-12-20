package stepanPackage.practice17_18;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    public static void regexer(String str, String regex) {
        Pattern pattern = Pattern.compile("^" + regex + "$");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) System.out.printf("Cтрока %s отвечает требованиям!\n", str);
        else System.out.printf("Cтрока %s не отвечает требованиям!\n", str);
    }

    public static void main(String[] args) {
        System.out.println("---------------- Задание 1 ----------------");
        String badStr = "abcdefghijklmnoasdfasdpqrstuv18340";
        regexer(badStr, "abcdefghijklmnopqrstuv18340");
        String goodStr = "abcdefghijklmnopqrstuv18340";
        regexer(goodStr, "abcdefghijklmnopqrstuv18340");

        System.out.println("---------------- Задание 2 ----------------");
        String niceMac = "aE:dC:cA:56:76:54";
        String badMac = "01:23:45:67:89:Az";
        regexer(niceMac, "([a-zA-Z1-9]{2}[:]){5}([a-zA-Z1-9]{2})");
        regexer(badMac, "([a-zA-Z1-9]{2}[:]){5}([a-zA-Z1-9]{2})");

        System.out.println("---------------- Задание 3 ----------------");
        List<String> list = Arrays.asList("34.56 UAH", "99 EU", "2000 RUR", "555 BNB", "17.020 USD");
        for (String str : list) regexer(str, "([0-9]+.[0-9]{2}) (USD|RUR|EU)");
    }
}
