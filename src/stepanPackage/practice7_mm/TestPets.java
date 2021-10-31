import java.util.*;

public class TestPets {
    public static int rNum(int min, int max) {
        max -= min;
        return (int)(Math.random() * ++max) + min;
    }

    public static void main(String[] args) {
        // Инициализируем HashMap (пункт 2)
        HashMap<String, Pet> hashmap = new HashMap<>();

        // Создадим отображение (пункт 3)
        hashmap.put("Cat", new Cat("Barsick"));
        hashmap.put("Cat", new Cat("Musya"));
        hashmap.put("Dog", new Dog("Mukhthar"));
        hashmap.put("Dog", new Dog("Max"));
        hashmap.put("Owl", new Owl("Marina"));
        hashmap.put("Owl", new Owl("Capitalina"));

        // Получаем набор элементов (пункт 4)
        Set<Map.Entry<String, Pet>> set = hashmap.entrySet();

        // Отобразим набор (пункт 5)
        for (Map.Entry<String, Pet> me : set) {
            System.out.println(me.getKey() + " " + me.getValue().getName());
        }

        // Добавим новые значения (пункт 6)
        hashmap.put("Cat", new Cat("Izolda"));

        // Сгенирируем набор случайных чисел и посчитаем количество повторов (пункт 7)
        int[] arrInt = new int[10];
        for (int i = 0; i < 10; i++) {
            arrInt[i] = rNum(1, 3);
        }

        //Выведем сгенерированный масив для проверки
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i] + " ");
        }
        System.out.println(" ");

        Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();

        for (Integer numka : arrInt) {
            Integer oldCount = occurrences.get(numka);
            if (oldCount == null) {
                oldCount = 0;
            }
            occurrences.put(numka, oldCount + 1);
        }

        for (Integer giga : occurrences.keySet()) {
            System.out.println("Для числа " + giga + " количество повторенией: " + occurrences.get(giga));
        }
    }
}
