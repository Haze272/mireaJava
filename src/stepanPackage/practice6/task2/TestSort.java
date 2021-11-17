package stepanPackage.practice6.task2;

import stepanPackage.practice6.Student;

import java.util.ArrayList;

public class TestSort {
    public static void main(String[] args) {
        SortingStudentsByGPA sorting = new SortingStudentsByGPA();

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

        int low = 0;
        int high = Student.students.size() - 1;
        sorting.qsort(Student.students, low, high);

        System.out.println("New array:");
        for (Student std : Student.students) {
            System.out.printf(std.toString());
        }
    }
}
