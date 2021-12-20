package stepanPackage.practice16.task2;

public final class Dish implements Item {
    private int price;
    private String name;
    private String description;

    public Dish(int price, String name, String description) throws IllegalArgumentException{
        if(price < 0 || name.equals("") || description.equals(""))
            throw new IllegalArgumentException();

        this.price = price;
        this.name = name;
        this.description = description;
    }
    public Dish(String name, String description) throws IllegalArgumentException{
        if(name.equals("") || description.equals(""))
            throw new IllegalArgumentException();

        this.price = 0;
        this.name = name;
        this.description = description;
    }

    @Override public int getPrice() {
        return price;
    }
    @Override public String getDescription() {
        return description;
    }
    @Override public String getName() {
        return name;
    }
    @Override public String toString() {
        return "Comida " + getName() + " cuesta " + getPrice() + ".\n Descripcion: " + getDescription();
    }
}
