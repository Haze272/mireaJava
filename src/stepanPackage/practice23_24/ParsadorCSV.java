package stepanPackage.practice23_24;

import java.util.HashMap;
import java.util.Map;

public class ParsadorCSV {
    private double income, expense = 0;
    private final Map<String, Double> expenses = new HashMap<>();

    public void calculateData(String csvlist) {
        String[] columns = csvlist.split(",");

        double incomy = Double.parseDouble(columns[6]);
        double expensy = Double.parseDouble(columns[7].replaceAll("\\\"", "").replace(',', '.'));

        if (incomy == 0) {
            calculateExpense(columns[5], expensy);
        } else {
            this.income += incomy;
        }
    }

    private void calculateExpense(String expenseName, double expense) {
        this.expense += expense;
        //System.out.println("-----------" + expenseName);
        String[] transaction = expenseName.trim().split(" {3,}");
        //System.out.println("-----------" + transaction);
        String[] temp = transaction[1].split("/");
        //System.out.println("-----------" + temp);
        String[] suppliesTemp = temp[temp.length - 1].split("\\\\");
        //System.out.println("-----------" + suppliesTemp);
        String supplies = suppliesTemp[suppliesTemp.length - 1];
        //System.out.println("-----------" + supplies);

        if (!expenses.containsKey(supplies))
            expenses.put(supplies, expense);
        else {
            double sum = expenses.get(supplies);
            sum += expense;
            expenses.put(supplies, sum);
        }
    }

    public void printFile() {
        System.out.printf("Сумма расходов: %.2f руб.\n", this.expense);
        System.out.printf("Сумма доходов: %.2f руб.\n", this.income);
        System.out.println("\nСуммы расходов по организациям:");

        for (String supplies : expenses.keySet()) {
            System.out.printf("%s    %f %s\n", supplies, expenses.get(supplies), "руб.");
        }
    }
}
