package stepanPackage.practice6.task2;

import stepanPackage.practice6.Student;
import java.util.*;

public class SortingStudentsByGPA implements Comparator<Student> {

    public static void qsort(ArrayList<Student> array, int low, int high) {
        if (array.size() == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        Student opora = array.get(middle);

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array.get(i).getAverageScore() < opora.getAverageScore()) { // <
                i++;
            }

            while (array.get(j).getAverageScore() > opora.getAverageScore()) { // >
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            qsort(array, low, j);

        if (high > i)
            qsort(array, i, high);
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAverageScore() > o2.getAverageScore()) return 1;
        else if (o1.getAverageScore() < o2.getAverageScore()) return -1;
        else return 0;
    }
}
