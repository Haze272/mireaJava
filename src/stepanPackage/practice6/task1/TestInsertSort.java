package stepanPackage.practice6.task1;

import java.util.ArrayList;

public class TestInsertSort {


    public static void main(String[] args) {

        Student student1 = new Student(55, "Pablo");
        Student student2 = new Student(13, "Juan");
        Student student3 = new Student(35, "Aquilino");
        Student student4 = new Student(568, "Nicolas");
        Student student5 = new Student(5, "Rogelio");
        Student student6 = new Student(39, "Iban");
        Student student7 = new Student(81, "Fermin");

        System.out.println("Old array:");
        for (int std : Student.iDNumber) {
            System.out.printf("id[%d] Student: %s\n", std, Student.getStudentById(std));
            //System.out.printf("id - %d\n", std);
        }

        Student.sortStudents();

        System.out.println("New array:");
        for (int std : Student.iDNumber) {
            System.out.printf("id[%d] Student: %s\n", std, Student.getStudentById(std));
            //System.out.printf("id - %d\n", std);
        }

        //System.out.println(Student.getStudentById(99));
    }
}
