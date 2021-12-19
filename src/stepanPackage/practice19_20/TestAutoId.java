package stepanPackage.practice19_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class TestAutoId {
    public static void main(String[] args) {
        ArrayList<String> numeros = AutoIdGenerator.generate(3000);
        numeros.add("А777МР 77");
        numeros.add("Е999КХ 99");

        for (String num : numeros) {
            System.out.println(num);
        }


        System.out.println("----------------------------------------");
        ArrayList<String> sortedNumeros = numeros;
        Collections.sort(sortedNumeros);

        final long then = System.nanoTime();
        boolean isFound = numeros.contains("А777МР 77");
        final long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - then);
        if (isFound) {
            System.out.println("Поиск перебором: номер найден, поиск занял " + millis + "ms");
        }

        final long then1 = System.nanoTime();
        boolean isFound1 = sortedNumeros.contains("А777МР 77");
        final long millis1 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - then1);
        if (isFound1) {
            System.out.println("Бинарный поиск: номер найден, поиск занял " + millis1 + "ms");
        }
    }
}
