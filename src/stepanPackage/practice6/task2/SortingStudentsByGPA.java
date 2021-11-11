package stepanPackage.practice6.task2;

import stepanPackage.practice6.Student;
import java.util.*;

public class SortingStudentsByGPA implements Comparator<Student> {

    ArrayList<Student> fastSort(ArrayList<Student> array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;

        Student pivot = array.get((leftMarker + rightMarker) / 2);
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (array.get(leftMarker) < pivot) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            fastSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            fastSort(source, leftBorder, rightMarker);
        }
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAverageScore() > o2.getAverageScore()) return 1;
        else if (o1.getAverageScore() < o2.getAverageScore()) return -1;
        else return 0;
    }
}
