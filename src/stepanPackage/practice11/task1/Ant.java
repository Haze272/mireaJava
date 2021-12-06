package stepanPackage.practice11.task1;

public class Ant {
    private static int _globalId;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    Ant() {
        setId(_globalId);
        _globalId++;
    }

    @Override
    public String toString() {
        return "Ant" + String.valueOf(getId());
    }
}
