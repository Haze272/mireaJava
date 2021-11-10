package stepanPackage.practice6.task1;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    public static ArrayList<Integer> iDNumber = new ArrayList<Integer>();

    Student(int studentId, String studentName) {
        setId(studentId);
        setName(studentName);
        iDNumber.add(studentId);
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
