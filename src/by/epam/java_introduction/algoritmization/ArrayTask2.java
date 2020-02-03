package by.epam.java_introduction.algoritmization;

/*
Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
Подсчитать количество замен.
 */

import java.util.Arrays;

public class ArrayTask2 {
    public static void main(String[] args) {
        double[] a = {-5, 5.55, 1, 0.5, 101010.1010};
        double z = 0.001;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > z) {
                a[i] = z;
                count++;
            }
        }
        System.out.println("Измененный массив: " + Arrays.toString(a));
        System.out.println("Количество замен: " + count);
    }
}
