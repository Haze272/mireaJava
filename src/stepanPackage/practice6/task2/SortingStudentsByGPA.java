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
}
