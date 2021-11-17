package stepanPackage.practice6.task2;

import stepanPackage.practice6.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSort {
    public static void main(String[] args) {

        Student student1 = new Student(55, "Pablo", 4.5);
        Student student2 = new Student(13, "Juan", 3.56);
        Student student3 = new Student(35, "Aquilino", 4.67);
        Student student4 = new Student(568, "Nicolas", 4.93);
        Student student5 = new Student(5, "Rogelio", 3.7);
        Student student6 = new Student(39, "Iban", 2.72);
        Student student7 = new Student(81, "Fermin", 3.78);

        System.out.println("Old array:");
        for (Student std : Student.students) {
            System.out.printf(std.toString());
        }

        Comparator averageScoreComparator = new SortingStudentsByGPA();
        Collections.sort(Student.students, averageScoreComparator);


        System.out.println("New array:");
        for (Student std : Student.students) {
            System.out.printf(std.toString());
        }
    }
}
