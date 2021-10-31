import java.util.*;

public class TestPets {
    public static String rNum(int min, int max) {
        max -= min;
        return String.valueOf((int)(Math.random() * ++max) + min);
    }

    public static void main(String[] args) {
        // Инициализируем HashMap (пункт 2)
        Map<String, List<? extends Pet>> hashmap = new HashMap<>();

        // Создадим отображение (пункт 3)
        hashmap.put("Cats", Arrays.asList(new Cat("Barsick"), new Cat("Musya")));
        hashmap.put("Dogs", Arrays.asList(new Cat("Mukhthar"), new Cat("Max")));
        hashmap.put("Owls", Arrays.asList(new Cat("Marina"), new Cat("Capitalina")));

        // Получаем набор элементов (пункт 4)
        Set<Map.Entry<String, List<? extends Pet>>> set = hashmap.entrySet();

        // Отобразим набор (пункт 5)
        for (Map.Entry<String, List<? extends Pet>> me : set) {
            System.out.println(me.getKey() + " contains");
            for (Pet pet : me.getValue()) {
                System.out.println("  " + pet.getName());
            }
        }

        // Добавляем новые значения (пункт 6)
        //hashmap.put("Cats", Arrays.asList(new Cat("Magnus")));

        // Генерируем случайные числа для подсчёта повторов (пункт 7)
        Map<String, List<? extends Pet>> hashmap2 = new HashMap<>();

        for (int i = 0; i < 100; i++) {
            hashmap.put(rNum(1, 10), Arrays.asList(new Cat("Element" + i)));
        }
    }
}
