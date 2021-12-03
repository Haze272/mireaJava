package stepanPackage.practice11_mm;

import java.util.ArrayList;
import java.util.Collections;

public class Horse {
    private String name;
    private int speed, position;

    public static ArrayList<Horse> horses = new ArrayList<>();

    public Horse(String name) {
        setName(name);
        horses.add(this);
        speed = 30;
        setPosition(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void run() {
        position += (speed + (0 + (int)(Math.random() * 10)));
    }

    public static void swap(int first, int second) {
        synchronized(Horse.class) {
            Collections.swap(Horse.horses, first, second);
        }
    }
}
