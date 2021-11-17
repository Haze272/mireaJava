package stepanPackage.practice6.task3;

import stepanPackage.practice6.Student;

import java.util.ArrayList;

public class TestMergeSort {
    public static void main(String[] args) {
        ArrayList<Student> students1 = new ArrayList<Student>();
        ArrayList<Student> students2 = new ArrayList<Student>();

        students1.add(new Student(55, "Pablo", 3.5));
        students1.add(new Student(13, "Juan", 3.56));
        students1.add(new Student(35, "Aquilino", 4.67));

        students2.add(new Student(568, "Nicolas", 2.93));
        students2.add(new Student(5, "Rogelio", 2.7));
        students2.add(new Student(39, "Iban", 3.72));
        students2.add(new Student(81, "Fermin", 4.78));

        System.out.println("Old array:");
        for (Student std : Student.students) {
            System.out.printf(std.toString());
        }

    }
}
