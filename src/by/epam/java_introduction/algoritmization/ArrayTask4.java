package by.epam.java_introduction.algoritmization;

import java.util.Arrays;

/*
Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */
public class ArrayTask4 {
    public static void main(String[] args) {
        double[] array = {200000, 14.25555, 0.3333333, 0, 10101.10, 0, -12};
        int indMax = 0;
        int indMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indMax]) {
                indMax = i;
            } else if (array[i] < array[indMin]) {
                indMin = i;
            }
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.println("Минимальный элемент массива: " + array[indMin]);
        System.out.println("Максимальный элемент массива: " + array[indMax]);

        double tmp = array[indMax];
        array[indMax] = array[indMin];
        array[indMin] = tmp;

        System.out.println("Измененный массив: " + Arrays.toString(array));
    }
}
