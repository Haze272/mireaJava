package stepanPackage.practice6;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private double averageScore;

    public static ArrayList<Integer> iDNumber = new ArrayList<Integer>();
    public static ArrayList<Student> students = new ArrayList<Student>();

    public Student(int studentId, String studentName, double averageScore) {
        setId(studentId);
        setName(studentName);
        setAverageScore(averageScore);

        iDNumber.add(studentId);
        students.add(this);
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public double getAverageScore() {
        return averageScore;
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

    public static void insertionSort() {
        for (int i = 1; i < iDNumber.size(); i++) {
            int current = iDNumber.get(i);
            int j = i - 1;

            while(j >= 0 && current < iDNumber.get(j)) {
                iDNumber.set(j + 1, iDNumber.get(j));
                j--;
            }

            iDNumber.set(j + 1, current);
        }
    }

    @Override
    public String toString() {
        String result = "id: " + getId() + "| Name: " + getName() + " | Score: " + getAverageScore() + "\n";
        return result;
    }
}
