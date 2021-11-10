package stepanPackage.practice6.task2;

import stepanPackage.practice6.Student;

import java.util.*;

public class SortingStudentsByGPA implements Comparator<Student> {


    ArrayList<Student> fastSort(ArrayList<Student> array) {
        if (array.size() < 2) return array;

        if (array.size() == 2) {
            if (compare(array.get(0), array.get(1)) > 0) {
                Student toFirst = array.get(1);

                array.set(1, array.get(0));
                array.set(0, toFirst);
            }
        }

        return array;
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAverageScore() > o2.getAverageScore()) return 1;
        else if (o1.getAverageScore() < o2.getAverageScore()) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sorting;
        Student student1 = new Student(55, "Pablo", 4.5);
        Student student2 = new Student(13, "Juan", 3.56);
        //Student student3 = new Student(35, "Aquilino", 4.67);
        //Student student4 = new Student(568, "Nicolas", 4.93);
        //Student student5 = new Student(5, "Rogelio", 3.7);
        //Student student6 = new Student(39, "Iban", 2.72);
        //Student student7 = new Student(81, "Fermin", 3.78);

        System.out.println("Old array:");
        for (Student std : Student.students) {
            System.out.printf(std.toString());
        }

        ArrayList<Student> newStudents = sorting.fastSort(Student.students);

        System.out.println("New array:");
        for (Student std : Student.students) {
            System.out.printf(std.toString());
        }
    }
}
