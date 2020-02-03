package by.epam.java_introduction.algoritmization;

import java.util.Arrays;

/*
 Дана последовательность целых чисел a1, a2, ..., an. Образовать новую последовательность, выбросив из исходной те члены,
 которые равны min(a1, a2, ..., an).
 */
public class ArrayTask8 {
    public static void main(String[] args) {
        int[] a = {15, 15, -1, -1, 15, -15};

        //находим минимальный элемент массива
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        //рассчитываем длину новой последовательности
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != min) {
                n++;
            }
        }

        //заполняем новую последовательность
        if (n != 0) {
            int b[] = new int[n];
            int j = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != min) {
                    b[j] = a[i];
                    j++;
                }
            }
            System.out.println("Итоговая последовательность: " + Arrays.toString(b));
        } else {
            System.out.println("Исходная последовательность состоит из одинаковых чисел");
        }
    }
}