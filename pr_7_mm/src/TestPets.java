import java.util.*;

public class TestPets {

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
        System.out.println("personMap: " + hashmap);
        System.out.println("personMap.keySet(): " + hashmap.keySet());

        for(String petType : hashmap.keySet()){
            System.out.println(petType + " contains");
            for (Pet pet : hashmap.get(petType)){
                System.out.println("  " + pet);
            }
        }
    }
}
