package stepanPackage.practice12to15.task3;

import java.util.ArrayList;

public class Shirt {
    public static ArrayList<Shirt> shirts = new ArrayList<>();

    private String article, name, color, size;

    Shirt (String fullItem) {
        String[] dividedShirt = fullItem.split(", ");
        article = dividedShirt[0];
        name = dividedShirt[1];
        color = dividedShirt[2];
        size = dividedShirt[3];
        shirts.add(this);
    }

    Shirt (String[] arr) {
        for(String ik : arr) {
            Shirt newShirt = new Shirt(ik);
        }
    }

    @Override
    public String toString() {
        return "article='" + article + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'';
    }
}
