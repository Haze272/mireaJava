package stepanPackage.practice16.task1;

import stepanPackage.practice16.task2.Item;

public final class Drink implements Item {
    private int price;
    private String name;
    private String description;

    public Drink(int price, String name, String description) throws IllegalArgumentException{
        if(price < 0 || name.equals("") || description.equals(""))
            throw new IllegalArgumentException();

        this.price = price;
        this.name = name;
        this.description = description;
    }
    public Drink(String name, String description) throws IllegalArgumentException{
        if(name.equals("") || description.equals(""))
            throw new IllegalArgumentException();

        this.price = 0;
        this.name = name;
        this.description = description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bebida " + getName() + " cuesta " + getPrice() + ".\n Descripcion: " + getDescription();
    }
}
