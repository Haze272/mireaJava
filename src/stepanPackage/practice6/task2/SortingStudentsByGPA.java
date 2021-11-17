package stepanPackage.practice6.task2;

import stepanPackage.practice6.Student;
import java.util.*;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAverageScore() < o2.getAverageScore()) return 1;
        else if (o1.getAverageScore() > o2.getAverageScore()) return -1;
        else return 0;
    }
}
