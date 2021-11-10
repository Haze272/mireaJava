package stepanPackage.practice6.task1;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;

    public static ArrayList<Integer> iDNumber = new ArrayList<Integer>();
    public static ArrayList<Student> students = new ArrayList<Student>();

    Student(int studentId, String studentName) {
        setId(studentId);
        setName(studentName);
        iDNumber.add(studentId);
        students.add(this);
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

    public static String getStudentById(int id) {
        Student result = null;
        for (Student std : students) {
            if (std.id == id) {
                result = std;
            }
        }
        try {
            return result.name;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.printf("Student with id %d wasn't found\n", id);
            return "N/A";
        }
    }

    public static void sortStudents() {
        for (int i = 1; i < iDNumber.size(); i++) {
            int current = iDNumber.get(i);
            int j = i - 1;

            while(j >= 0 && current < iDNumber.get(j)) {
                iDNumber.set(j + 1, iDNumber.get(j));
                j--;
            }
            // в этой точке мы вышли, так что j так же -1
            // или в первом элементе, где текущий >= a[j]
            iDNumber.set(j + 1, current);
        }
    }
}
