package stepanPackage.practice19_20;

import java.util.ArrayList;

public class AutoIdGenerator {
    private final static String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};

    public static ArrayList<String> generate(int quantity) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            result.add(getNumero());
        }

        return result;
    }

    public static String getNumero() {
        StringBuilder result = new StringBuilder();

        result.append(letters[0 + (int) (Math.random() * 11)]);
        int numba = 1 + (int) (Math.random() * 9);
        result.append(numba);
        result.append(numba);
        result.append(numba);
        result.append(letters[0 + (int) (Math.random() * 11)]);
        result.append(letters[0 + (int) (Math.random() * 11)]);
        int region = 1 + (int) (Math.random() * 199);
        result.append(" ");
        if (region < 10) result.append("0");
        result.append(region);

        return String.valueOf(result);
    }
}
